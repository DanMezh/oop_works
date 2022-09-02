package Program.GeoTrees;

import java.util.ArrayList;

import Program.Person.Person;

public class GeoTree implements IGeoTree {
    private ArrayList<RelationsNode> tree = new ArrayList<>();

    @Override
    public ArrayList<RelationsNode> getTree() {
        return tree;
    }

    @Override
    public void append(Person parent, Person children) {
        tree.add(new RelationsNode(parent, RelationType.PARENT_OF, children));
        tree.add(new RelationsNode(children, RelationType.CHILD_OF, parent));
    }

    @Override
    public void addFamily(Person parent1, Person parent2, Person[] childrens) {
        tree.add(new RelationsNode(parent1, RelationType.HUSBAND_WIFE_OF, parent2));
        for (Person child : childrens) {
            tree.add(new RelationsNode(parent1, RelationType.PARENT_OF, child));
            tree.add(new RelationsNode(parent2, RelationType.PARENT_OF, child));
            tree.add(new RelationsNode(child, RelationType.CHILD_OF, parent1));
            tree.add(new RelationsNode(child, RelationType.CHILD_OF, parent2));
        }
    }
}
