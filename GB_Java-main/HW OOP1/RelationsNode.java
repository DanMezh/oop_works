/**
 * Тип отношений, от превого ко второму
 */
enum RelationType {
    parentOf,
    husbandWifeOf,
    childOf
}

public class RelationsNode {
    Person person1;
    Person person2;
    RelationType relation;

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