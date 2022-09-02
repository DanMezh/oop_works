package Program.GeoTrees;

import java.util.ArrayList;

import Program.Person.Person;

public interface IGeoTree {

    ArrayList<RelationsNode> getTree();

    void append(Person parent, Person children);

    void addFamily(Person parent1, Person parent2, Person[] childrens);
}
