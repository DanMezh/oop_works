package Program.GeoTrees;

import java.util.ArrayList;

import Program.Person.Person;

public class Research {
    ArrayList<RelationsNode> tree;

    public Research(IGeoTree geoTree) {
        this.tree = geoTree.getTree();
    }

    /**
     * Ищем всех людей находящихся в указаннх связях с указанным человеком
     * 
     * @param person   - человек
     * @param relation - тип связей
     * @return - список людей
     */
    public ArrayList<Person> find(RelationType relation, Person person) {

        var result = new ArrayList<Person>();

        for (RelationsNode t : tree) {
            if (t.getPerson2().equals(person)
                    && t.getRelation() == relation) {
                result.add(t.getPerson1());
            }
        }
        return result;
    }

    public void setGeoTree(IGeoTree geoTree) {
        this.tree = geoTree.getTree();
    }
}
