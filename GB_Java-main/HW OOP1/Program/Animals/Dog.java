package Program.Animals;

public class Dog extends Pets {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this("Безымянный пёс");
    }

    private void bark() {
        System.out.printf("%s лает\n", this.name);
    }

    @Override
    public void hearCall(String words) {
        if (words.contains(this.name)) {
            bark();
        }
    }

}
