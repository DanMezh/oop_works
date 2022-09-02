import java.util.ArrayList;

public class Cupboard {
    private static Integer id = 0; // Порядковый номер шкафа
    private String name;
    private boolean openStatus = false; // true = Open, false = Closed
    private ArrayList<Item> items;

    /**
     * Конструктор шкафа
     * 
     * @param name   - название шкафа
     * @param status - статус шкаф открыт(true)/закрытый(false), по умолчанию
     *               закрыт(false)
     * @param items  - предметы в шкафу, по умолчанию пустой(без элементов)
     */
    public Cupboard(String name, boolean status, Item[] items) {
        id++;
        this.name = name;
        this.openStatus = status;
        this.items = new ArrayList<Item>();
        for (Item item : items) {
            this.items.add(item);
        }
    }

    public Cupboard(String name, boolean status) {
        this(name, status, new Item[0]);
    }

    public Cupboard(String name) {
        this(name, false);
    }

    public Cupboard() {
        this("Шкаф №" + id);
    }

    /**
     * Открываем шкаф
     */
    public void openCupboard() {
        this.openStatus = true;
    }

    /**
     * Закрываем шкаф
     */
    public void closeCupboard() {
        this.openStatus = false;
    }

    /**
     * Метод добавления в шкаф предмета по имени
     * 
     * @param itemsName - имя предмета
     * @return - удалось(true), не удалось(false)
     */
    public boolean addItemToCupboard(Item item) { // ToDo добавить ёмкость шкафа(сейчас шкаф бесконечный), соотвестнно
                                                  // не возможность добавить если ёмкость превышена
        this.items.add(item);
        return true;
    }

    /**
     * Метод удаления из шкафа предмата по имени
     * 
     * @param item - название забираемого предмета
     * @return - удалось(true), не удалось(false) (например: если такого предмета
     *         нет в шкафе)
     */
    public boolean removeItemFromCupboard(Item item) {
        if (items.contains(item)) {
            this.items.remove(item);
            return true;
        }
        return false;
    }

    /**
     * Метод показывает что внутри шкафа в виде обобщающей строки
     */
    public String printItems() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name + ":");
        for (int i = 0; i < this.items.size(); i++) {
            sb.append("\n  " + (i + 1) + ". " + this.items.get(i));
        }
        return sb.toString() + "\n"; 
    }

    @Override
    public String toString() {
        return this.name;
    }
}
