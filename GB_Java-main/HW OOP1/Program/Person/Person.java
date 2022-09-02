package Program.Person;

import java.util.ArrayList;

import Program.Animals.Pets;
import Program.CupBoards.Cupboard;
import Program.Item.Item;

public class Person implements PetCaller, CupBoardInteractor {
    private String firstName;
    private ArrayList<Item> items;

    /**
     * Конструктор человека =)
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

    public String getItems() {
        StringBuilder sb = new StringBuilder();
        sb.append("У " + this.firstName + " в корманах: ");
        String separator = "";
        for (Item item : items) {
            sb.append(separator);
            separator = ", ";
            sb.append(item);
        }
        return sb.append("\n").toString();
    }

    // имплементация интерфейса зов питомцев
    @Override
    public void callPet(Pets[] pets, String phrase) {
        if (pets.length > 0) {
            for (Pets pet : pets) {
                pet.hearCall(phrase);
            }
        }
    }

    // имлепментируем cupBoardInteractor
    @Override
    public boolean addItem(Item item) {
        if (this.items.contains(item))
            return false;
        return items.add(item);
    }

    @Override
    public boolean removeItem(Item item) {
        return this.items.remove(item);
    }

    @Override
    public void openCupboard(Cupboard cupboard) {
        cupboard.setOpenStatus(true);
        System.out.printf("%s открыл '%s'\n", this.firstName, cupboard);
    }

    @Override
    public void closeCupboard(Cupboard cupboard) {
        cupboard.setOpenStatus(false);
        System.out.printf("%s закрыл '%s'\n", this.firstName, cupboard);
    }

    @Override
    public void takeItem(Cupboard cupboard, Item item) {
        if (cupboard.isOpenStatus()) {
            takeItemFromCupboard(cupboard,item);
        } else {
            System.out.printf("%s не может забрать '%s' т.к. '%s' закрыт\n", this.firstName, item, cupboard);
        }
    }

    private void takeItemFromCupboard(Cupboard cupboard, Item item){
        if (cupboard.removeItem(item)) {
            this.addItem(item);
            System.out.printf("%s забрал '%s' из '%s' \n", this.firstName, item, cupboard);
        } else {
            System.out.printf("%s не смог забрать '%s' из '%s' \n", this.firstName, item, cupboard);
        }
    }

    @Override
    public void putItem(Cupboard cupboard, Item item) {
        if (items.contains(item)) { //если у человека есть предмет
            if (cupboard.isOpenStatus()) {
                putItemIntoCupboard(cupboard, item);
            } else {
                System.out.printf("%s не может положить '%s' в '%s' так как '%s' закрыт\n", this.firstName, item,
                        cupboard, cupboard);
            }
        }
    }

    private void putItemIntoCupboard(Cupboard cupboard, Item item){
        if (cupboard.addItem(item)) { // если получилось его положить в шкаф
            this.removeItem(item); // убираем у человека
            System.out.printf("%s положил '%s' в '%s' \n", this.firstName, item, cupboard);
        } else {
            System.out.printf("%s не смог положить '%s' в '%s' \n", this.firstName, item, cupboard);
        }
    }

    @Override
    public String toString() {
        return firstName;
    }
}
