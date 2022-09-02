package FamilyTree.src.Core.Infrastructure;

import FamilyTree.src.Core.Models.Person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Storage {
    private List<Person> persons;

    public Storage() {
        persons = new ArrayList<>();
    }

    public Storage(ArrayList<Person> persons) {
        this();
        create(persons.toArray(new Person[persons.size()]));
    }

    public void create(Person... persons) {
        Collections.addAll(this.persons, persons);
    }

    public ArrayList<Person> getPersons() {
        return (ArrayList<Person>) (persons);
    }

    public Person getPerson(int idPerson) {
        for (Person person : persons) {
            if (person.getId() == idPerson) {
                return person;
            }
        }
        return Person.nullPerson();
    }
}
