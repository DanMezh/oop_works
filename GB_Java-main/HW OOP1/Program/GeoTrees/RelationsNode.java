package Program.GeoTrees;

import Program.Person.Person;

public class RelationsNode {

    private Person person1;
    private Person person2;
    private RelationType relation;

    public Person getPerson1() {
        return person1;
    }

    public Person getPerson2() {
        return person2;
    }

    public RelationType getRelation() {
        return relation;
    }

    public RelationsNode(Person person1, RelationType relation, Person person2) {
        this.person1 = person1;
        this.relation = relation;
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, relation, person2);
    }

}