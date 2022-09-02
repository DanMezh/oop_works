package FamilyTree.src.Client;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Person;
import FamilyTree.src.Core.Presenter.Presenter;
import FamilyTree.src.Core.Views.View;
import FamilyTree.src.Mathematics.IntUtil;
import FamilyTree.src.Research.FindChildrens;
import FamilyTree.src.Research.FindParents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App {
    private View view;
    private Presenter presenter;

    public App(Presenter presenter, View view) {
        this.view = view;
        this.presenter = presenter;
    }

    public void start() {
        StringBuilder text = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Show persons\n")
                .append("2 - Find childrens\n")
                .append("3 - Find parents\n")
                .append("4 - sort geoTree by name\n")
                .append("0 - exit\n")
                .append("\n");

        presenter.show(true);
        programCycle(text);
    }

    private void programCycle(StringBuilder sb) {
        while (true) {
            view.show(sb.toString());
            switch (view.get()) {
                case "1":
                    presenter.show(false);
                    break;
                case "2":
                    Person person = getPerson();
                    ArrayList<Person> childrens = new FindChildrens(person).startResearch();
                    view.show("Children " + person + " is: \n");
                    new Presenter(view, new Storage(childrens)).show();
                    break;
                case "3":
                    Person personResearch = getPerson();
                    ArrayList<Person> parents = new FindParents(personResearch).startResearch();
                    view.show("Parents " + personResearch + " is: \n");
                    new Presenter(view, new Storage(parents)).show();
                    break;
                case "4":
                    Collections.sort(presenter.getStorage().getPersons());
                    presenter.show(false);
                    break;
                case "0":
                    return;
            }
        }
    }

    private Person getPerson() {
        int id;
        Person person;
        do {
            id = getNumber();
            person = presenter.getStorage().getPerson(id);
        } while (person.equals(Person.nullPerson()));
        return person;
    }

    private int getNumber() {
        String numberString;
        boolean checkNumeric;
        do {
            view.show("Enter the ID of the person to investigate\n");
            numberString = view.get();
            checkNumeric = !(IntUtil.isNumeric(numberString));
        } while (checkNumeric);
        return Integer.parseInt(numberString);
    }


}
