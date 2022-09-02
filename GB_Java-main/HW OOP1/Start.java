/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        
        System.out.println("----------------------------------------------------------------");
        //Дерево потомков
        Person masha = new Person("Masha");
        Person pasha = new Person("Pasha");
        Person yasha = new Person("Yasha");
        Person natasha = new Person("Natasha");
        Person sasha = new Person("Sasha");
        Person egor = new Person("Egor");
        Person irina = new Person("Irina");
        Person misha = new Person("Misha");

        GeoTree geoTree1 = new GeoTree();
        Person[] mashaAndPashaChilds = {yasha,natasha,sasha};
        geoTree1.addFamily(masha, pasha, mashaAndPashaChilds);
        
        geoTree1.append(sasha, egor);
        geoTree1.append(sasha, irina);
        geoTree1.append(natasha, misha);

        Research research1 = new Research(geoTree1);
        System.out.println(research1.find(RelationType.childOf, masha) + "- дети Маши (Яша, Наташа, Саша)"); 
        System.out.println(research1.find(RelationType.childOf, sasha) + "- дети Саши (Ирина Ягор)"); 
        System.out.println(research1.find(RelationType.husbandWifeOf, pasha) + "- супруга Паши (Маша)");
        System.out.println(research1.find(RelationType.parentOf, natasha) + " - родители Наташи (Маша и Паша)");
        System.out.println(research1.find(RelationType.parentOf, masha) + " - родители Маши(неизвестны)");
        
        System.out.println("----------------------------------------------------------------");

        // Человек и шкаф
        Item ball = new Item("Мяч"); // Создём предметы
        Item coin = new Item("Монетка");
        Item panckace = new Item("Блин");
        Item yogurt = new Item("Йогурт");
        Item elefant = new Item("Слон - настоящий большой слон");
        
        Cupboard justCupboard = new Cupboard("Просто шкаф"); //создаём шкафы 
        Item[] itemsInFridge = {panckace, yogurt};
        Cupboard fridge = new Cupboard("Холодильник", true, itemsInFridge);
        System.out.println(fridge.printItems()); // смотрим что у нас в холодильнике

        pasha.addItem(coin); //добавляем предметы человеку
        pasha.addItem(ball);
        System.out.println(pasha.getItems()); // смотрим что у паши в карманах

        justCupboard.addItemToCupboard(elefant); //напрямую добавляем слона в шкаф (потому-что можем)

        pasha.getItemFromCupboard(fridge, elefant); //пробуем достать слона из холодильника (его там нет)
        pasha.getItemFromCupboard(fridge, yogurt); //забираем из холодильника йогурт

        pasha.putItemIntoCupboard(justCupboard, panckace); //пытаемся положить в шкаф блин (который в холодильнике)
        pasha.putItemIntoCupboard(justCupboard, coin); //калдём монетку в шкаф

        pasha.getItemFromCupboard(justCupboard, elefant); //забираем слона из шкафа
        pasha.putItemIntoCupboard(fridge, elefant); //кладём слона в холодильник

        System.out.println("----------------------------------------------------------------");
        // Кот и человек
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Котик");
        Cat cat3 = new Cat("Мотик");
        
        masha.callCat("Кис-Кис", cat1);
        masha.callCat("Барсик", cat1);
        pasha.callCat("Барсик", cat2);
        yasha.callCat("Барсик", cat3);

        System.out.println("----------------------------------------------------------------");
    }
}
