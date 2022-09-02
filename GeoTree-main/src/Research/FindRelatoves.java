package FamilyTree.src.Research;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Kinship;
import FamilyTree.src.Core.Models.Person.Person;

import java.util.ArrayList;

public abstract class FindRelatoves implements Research {
    private Storage object;
    private Person subject;

    public FindRelatoves(Storage object, Person subject) {
        this.object = object;
        this.subject = subject;
    }

    @Override
    public ArrayList<Person> startResearch() {
        ArrayList<Person> childrens = new ArrayList<>();
        findRelatives(childrens, Kinship.UNSPECIFIED, -1);
        return childrens;
    }

    protected void findRelatives(ArrayList<Person> childrens, Kinship kinship, int generation) {
        for (Person relative :
                subject.getRelatives(kinship)) {
            if (relative.getKinship(subject).getGeneration() == generation) {
                childrens.add(relative);
            }
        }
    }
}
