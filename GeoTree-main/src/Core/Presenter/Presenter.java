package FamilyTree.src.Core.Presenter;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Person;
import FamilyTree.src.Core.Views.View;

import java.util.ArrayList;

public class Presenter {
    private View view;
    private Storage storage;

    public Presenter(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }

    public void show() {
        show(false);
    }

    public void show(Boolean showId) {
        for (Person person :
                this.storage.getPersons()) {
            String text = "";
            if (showId) {
                text = person.getId() + ": ";
            }
            text += person.toString();

            view.show(String.format("%s\n", text));
        }
    }


}
