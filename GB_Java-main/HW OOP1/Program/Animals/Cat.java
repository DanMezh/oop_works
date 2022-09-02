package Program.Animals;

public class Cat extends Pets {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        this("Безымянный кот");
    }

    /**
     * Реакция если кот услышал своё имя
     */
    private void accept() {
        System.out.printf("%s к вам бежит ... \n", this.name);
    }

    /**
     * Реакция игнорирования если позвали не по имени
     */
    private void reject() {
        System.out.printf("%s вас игнорит ... \n", this.name);
    }

    @Override
    public void hearCall(String words) {
        if (words.contains(this.name)) {
            accept();
        } else {
            reject();
        }
    }

}
