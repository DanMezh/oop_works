package FamilyTree.src.Core.Models.Person;

import FamilyTree.src.Core.Infrastructure.GenerateId.GenerateIntId;

import java.util.ArrayList;

public class Person implements Comparable<Person> {

    @Override
    public int compareTo(Person o) {
        return this.firstName.compareTo(o.firstName);
    }

    private class Relationship {
        private Kinship kinship;
        private Person relative;

        public Relationship(Kinship kinship, Person relative) {
            this.kinship = kinship;
            this.relative = relative;
        }

        public Person getRelative() {
            return relative;
        }

        public void setRelative(Person relative) {
            this.relative = relative;
        }

        public Kinship getKinship() {
            return kinship;
        }

        public void setKinship(Kinship kinship) {
            this.kinship = kinship;
        }
    }

    private int id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private ArrayList<Relationship> relationships = new ArrayList<>();

    private Person(String firstName, String lastName, Sex sex, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.id = id;
    }

    public Person(String firstName, String lastName, Sex male, GenerateIntId generateId) {
        this(firstName, lastName, male, generateId.genId());
    }

    public static Person nullPerson() {
        return new Person("null", "null", Sex.UNSPECIFIED, 0);
    }

    public int getId() {
        return id;
    }

    public Sex getSex() {
        return sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public boolean isRelative(Person relative) {
        Kinship kinship = getKinship(relative);
        return kinship != Kinship.UNSPECIFIED;
    }

    public Kinship getKinship(Person relative) {
        for (Relationship relationship :
                relationships) {
            if (relationship.getRelative().equals(relative)) {
                return relationship.getKinship();
            }
        }
        return Kinship.UNSPECIFIED;
    }

    public ArrayList<Person> getRelatives(Kinship kinship) {
        ArrayList<Person> relatives = new ArrayList<>();
        for (Relationship relationship :
                relationships) {
            if (relationship.getKinship() == kinship) {
                relatives.add(relationship.getRelative());
            }
        }
        return relatives;
    }

    public ArrayList<Person> getAllRelatives() {
        ArrayList<Person> relatives = new ArrayList<>();
        relatives.addAll(getRelatives(Kinship.ANCESTOR));
        relatives.addAll(getRelatives(Kinship.DESCENDANT));
        relatives.addAll(getRelatives(Kinship.SIBLINGS));
        return relatives;
    }

    public void addRelationship(Kinship kinship, Person relative) {
        addRelationships(new Relationship(kinship, relative));
    }

    private void addRelationships(Relationship... relationships) {
        for (Relationship relationship : relationships) {
            Person relative = relationship.getRelative();
            if (!isRelative(relative)) {
                this.relationships.add(relationship);
                Kinship kinship = Kinship.getKinshipByRelative(relationship.kinship);
                relative.relationships.add(new Relationship(kinship, this));
            } else {
                System.out.println("Такой родственник уже существует");
            }
        }
    }


    public void removeRelationship(Person relative) {
        if (isRelative(relative)) {
            removeRelationships();
        }
    }

    private void removeRelationships(Person... relatives) {
        for (Person relative : relatives) {
            removeRelative(relative);
        }
    }

    private void removeRelative(Person relative) {
        for (int i = 0; i < this.relationships.size(); i++) {
            if (this.relationships.get(i).getRelative().equals(relative)) {
                this.relationships.remove(i);
                relative.removeRelationships(this);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s(%s)", getFirstName(), getLastName(), sex.getSex());
    }

    @Override
    public boolean equals(Object person) {
        Person person1 = (Person) (person);
        return this.id == person1.id && this.firstName.equals(person1.firstName) && this.lastName.equals(person1.lastName) && this.sex == person1.sex;
    }
}