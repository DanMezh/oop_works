package Program.Animals;

public abstract class Pets implements HearCall {
    protected String name;

    public Pets(String name) {
        this.name = name;
    }

    public Pets() {
        this("Безымянный питомец");
    }

    protected String getName() {
        return name;
    }
}
