package FamilyTree.src.Research;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Kinship;
import FamilyTree.src.Core.Models.Person.Person;

import java.util.ArrayList;

public class FindParents extends FindRelatoves {

    public FindParents(Person subject) {
        super(new Storage(), subject);
    }

    @Override
    public ArrayList<Person> startResearch() {
        ArrayList<Person> childrens = new ArrayList<>();
        findRelatives(childrens, Kinship.ANCESTOR, 0);
        return childrens;
    }
}
