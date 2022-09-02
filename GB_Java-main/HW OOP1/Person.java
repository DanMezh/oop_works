import java.util.ArrayList;

public class Person {
    private String firstName;
    private ArrayList<Item> items;

    /**
     * Коструктов человека =)
     * 
     * @param firstName - имя человека
     * @param items     - предметы что есть у человека, по умолчанию пусто
     */
    public Person(String firstName, ArrayList<Item> items) {
        this.firstName = firstName;
        this.items = items;
    }

    public Person(String firstName) {
        this(firstName, new ArrayList<Item>());
    }

    public Person() {
        this("Безымянный");
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Открытие шкафа
     * 
     * @param cupboard - шкаф который открыавем
     */
    public void openCupboard(Cupboard cupboard) {
        cupboard.openCupboard();
    }

    /**
     * Закрытие шкафа
     * 
     * @param cupboard - шкаф который закрываем
     */
    public void closeCupboard(Cupboard cupboard) {
        cupboard.closeCupboard();
    }

    /**
     * Забираем предмет из шкафа
     * 
     * @param cupboard - шкаф
     * @param item     - предмет
     */
    public void getItemFromCupboard(Cupboard cupboard, Item item) {
        if (cupboard.removeItemFromCupboard(item)) { // если получилось убрать предмет из шкафа
            items.add(item); // добавляем его человеку
            System.out.printf("%s забрал '%s' из '%s' \n", this.firstName, item, cupboard);
        } else {
            System.out.printf("%s не смог забрать '%s' из '%s' \n", this.firstName, item, cupboard);
        }
    }

    /**
     * Кладём предмет в шкаф
     * 
     * @param cupboard - шкаф
     * @param item     - предмет
     */
    public void putItemIntoCupboard(Cupboard cupboard, Item item) {
        if (items.contains(item)) { // если у человека есть предмет
            if (cupboard.addItemToCupboard(item)) { // если получилось его положить в шкаф
                items.remove(item); // убираем у человека
                System.out.printf("%s положил '%s' в '%s' \n", this.firstName, item, cupboard);
            }
        } else {
            System.out.printf("%s не смог положить '%s' в '%s' \n", this.firstName, item, cupboard);
        }
    }

    /**
     * ЧИТ - Метод для добавления предметов человеку (из воздуха), если предметы не
     * были выданы при конструировании
     * 
     * @param item - предмет
     */
    public void addItem(Item item) {
        items.add(item);
    }

    public String getItems() {
        StringBuilder sb = new StringBuilder();
        sb.append("У " + this.firstName + " в корманах: ");
        for (Item item : items) {
            sb.append(item + ", ");
        }
        return sb.substring(0, sb.length() - 2).toString() + "\n";
    }

    /**
     * Метод позвать котика
     * 
     * @param phrase - сказанная фраза
     * @param target - какому коту
     */
    public void callCat(String phrase, Cat target) {
        target.hearCall(phrase);
    }

    @Override
    public String toString() {
        return firstName;
    }
}
