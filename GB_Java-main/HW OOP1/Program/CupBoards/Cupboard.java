package Program.CupBoards;

import java.util.ArrayList;

import Program.Item.Item;
import Program.Item.ItemManager;

public class Cupboard implements ItemManager {
    private static Integer id = 1; // Порядковый номер шкафа
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

    public void setOpenStatus(boolean bool) {
        this.openStatus = bool;
    }

    public boolean isOpenStatus() {
        return openStatus;
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
        return sb.append("\n").toString();
    }

    @Override
    public String toString() {
        return this.name;
    }

    // имплементация ItemManager'а
    @Override
    public boolean addItem(Item item) {
        if (this.items.contains(item))
            return false;
        return this.items.add(item);
    }

    @Override
    public boolean removeItem(Item item) {
        return this.items.remove(item);
    }
}
