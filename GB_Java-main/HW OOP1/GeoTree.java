import java.util.ArrayList;

public class GeoTree {
    private ArrayList<RelationsNode> tree = new ArrayList<>();
    
    public ArrayList<RelationsNode> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new RelationsNode(parent, RelationType.parentOf, children));
        tree.add(new RelationsNode(children, RelationType.childOf, parent));
    }

    public void addFamily(Person parent1, Person parent2, Person[] childrens) {
        tree.add(new RelationsNode(parent1, RelationType.husbandWifeOf, parent2));
        for (Person child : childrens) {
            tree.add(new RelationsNode(parent1, RelationType.parentOf, child));
            tree.add(new RelationsNode(parent2, RelationType.parentOf, child));
            tree.add(new RelationsNode(child, RelationType.childOf, parent1));    
            tree.add(new RelationsNode(child, RelationType.childOf, parent2));
        }
    }
}
