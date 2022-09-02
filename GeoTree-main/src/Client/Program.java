package FamilyTree.src.Client;

import FamilyTree.src.Core.Infrastructure.GenerateId.GeneratorIntId;
import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Kinship;
import FamilyTree.src.Core.Models.Person.Person;
import FamilyTree.src.Core.Models.Person.Sex;
import FamilyTree.src.Core.Presenter.Presenter;
import FamilyTree.src.Core.Views.ViewConsole;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Person person = new Person("Oleg", "Ankle", Sex.MALE, new GeneratorIntId());
        Person sun = new Person("Petr", "Ankle", Sex.MALE, new GeneratorIntId());
        Person daughter = new Person("Liza", "Ankle", Sex.FEMALE, new GeneratorIntId());
        Person father = new Person("Sasha", "Ankle", Sex.MALE, new GeneratorIntId());
        Person mother = new Person("Vera", "Ankle", Sex.FEMALE, new GeneratorIntId());
        Person[] persons = {person, sun, daughter, father, mother};
        person.addRelationship(Kinship.ancestor(0), father);
        person.addRelationship(Kinship.ancestor(0), mother);
        person.addRelationship(Kinship.descendant(0), sun);
        person.addRelationship(Kinship.descendant(0), daughter);
        Storage storage = new Storage();
        storage.create(persons);
        new App(new Presenter(new ViewConsole(), storage), new ViewConsole()).start();
    }
}