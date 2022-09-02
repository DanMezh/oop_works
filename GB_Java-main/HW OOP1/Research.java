import java.util.ArrayList;

/**
 * Research
 */
class Research {
    ArrayList<RelationsNode> tree;

    /**
     * Получаем всех потомков
     * @param geoTree
     */
    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }
    
    /**
     * Возвращаем все
     * @param person
     * @param relation
     * @return
     */
    public ArrayList<Person> find(RelationType relation, Person person) {

        var result = new ArrayList<Person>();

        for (RelationsNode t : tree) {
            if (t.person2.getFirstName() == person.getFirstName()
                    && t.relation == relation) {
                result.add(t.person1);
            }
        }
        return result;
    }
}