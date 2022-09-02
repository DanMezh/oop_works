public class Cat extends Pets{
    public Cat(String name) {
        super(name);
    }

    public Cat(){
        this("Безымянный кот");
    }

    /**
     * метод поведение кота на услашынные "слова"
     * @param Sound
     */
    public void hearCall(String Sound){
        if (Sound.contains(this.name)){
            accept();
        } else {
            reject();
        }
    }

    /**
     * Реакция если кот услышал своё имя
     */
    public void accept(){
        System.out.printf("%s к вам бежит ... \n", this.name);
    }

    /**
     * Реакция игнорирования если позвали не по имени
     */
    public void reject(){
        System.out.printf("%s вас игнорит ... \n", this.name);
    }

    public String getName(){
        return this.name;
    }
}
