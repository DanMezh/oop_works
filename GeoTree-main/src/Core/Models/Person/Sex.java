package FamilyTree.src.Core.Models.Person;

public enum Sex {
    MALE("M"),
    FEMALE("F"),
    UNSPECIFIED("U");
    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
