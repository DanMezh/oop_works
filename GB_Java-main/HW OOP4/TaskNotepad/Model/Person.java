package TaskNotepad.Model;

public class Person implements Cloneable {
    String firstName;
    String lastName;
    String patronimyc;

    public Person(String firstName, String patronimyc, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronimyc = patronimyc;
    }

    public String getFIO() {
        return new StringBuilder().append(lastName)
                .append(" ")
                .append(firstName.substring(0, 1))
                .append(".")
                .append(patronimyc.substring(0, 1))
                .append(".")
                .toString();
    }

    @Override
    public String toString() {
        return getFIO();
    }
}
