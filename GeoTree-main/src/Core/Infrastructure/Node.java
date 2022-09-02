package FamilyTree.src.Core.Infrastructure;

import FamilyTree.src.Core.Models.Person.Person;

import java.util.ArrayList;

// Не используемый класс, созданный на будущее улучшение
public class Node {
    private Person person;
    private ArrayList<Node> childrens = new ArrayList<>();

    public Node(Person person) {
        this.person = person;
    }

    // TODO проверку на уже присутствия ребенка вчисле детей и пр. проверки
    public void addChildrens(Node... childrens) {
        for (Node children : childrens) {
            this.childrens.add(children);
        }
    }

    public Person getPerson() {
        return person;
    }

    public ArrayList<Node> getChildrens() {
        return childrens;
    }

//    public Boolean hasPerson(Person person) {
//        for (Node childrens : childrens) {
//            if (childrens.getPerson() == person)
//                return true;
//            childrens.hasPerson(person);
//        }
//        return false;
//    }
//
//    public Boolean includes(Node node) {
//        for (Node children : this.childrens) {
//            if (children.equals(node))
//                return true;
//            children.includes(node);
//        }
//        return false;
//    }
}
