import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Start
 */
public class Program {

    private static void printData(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) throws Exception {
        // устаналиваем форматы даты для передачи Дат в конструкторы
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Товар
        Product NewProd = new Product("Товар", 30.50, 0.5, "кг");
        printData(NewProd);
        System.out.println("");
        
        //Продукт питания
        Food NewFood = new Food("Продукт питания - Шоколадка", 30.50, 0.5, "кг", "20/12/2028");
        printData(NewFood);
        // хлеб, срок годности +3 дня от сегодня
        Bread NewBread = new Bread("Хлеб бородинский", 35.43, 1.0, "шт.",
                LocalDate.now().plusDays(3).format(dateFormat), "Ржаная");
        printData(NewBread);
        //Яйца
        Eggs NewEggs = new Eggs("Яйца куриные", 50.00, 1.0, "упаковка",
                LocalDate.now().plusDays(14).format(dateFormat), 10);
        printData(NewEggs);
        System.out.println("");

        //Напиток
        Drink NewDrink = new Drink("Напиток - Соса-Сола", 60, 60.0, "бутылка", 0.5);
        printData(NewDrink);
        // молоко, срок годности +60 дней от сегодня
        Milk NewMilk = new Milk("Молоко коровье", 60.42, 20.0, "бутылок", 0.4, 20,
                LocalDate.now().plusDays(60).format(dateFormat));
        printData(NewMilk);
        // Лимонад полный клон Напитка
        Limonade newLimonade = new Limonade("Лимонад", 42, 10.0, "банка", 0.33);
        printData(newLimonade);
        System.out.println("");

        //Предметы гигиены
        HygieneItems NewHygieneItems = new HygieneItems("Предмет гигиены - Салфетка", 60, 10.0, "упаковка", 100);
        printData(NewHygieneItems);
        //Маски
        Masks NewMasks = new Masks("Маска от Ковида", 60, 10.0, "упаковка", 20);
        printData(NewMasks);
        //Туалетная бумага
        ToiletPaper NewToiletPaper = new ToiletPaper("Туалетная бумага", 260.25, 10.0, "упаковка", 80, 3);
        printData(NewToiletPaper);
        System.out.println("");

        //Товары для детей
        KidsProduct NewKidsProduct = new KidsProduct("Детские товар - Велосипед", 6000, 1.0, "шт.", 6, false);
        printData(NewKidsProduct);
        // Подгузник
        Diapers NewDiapers = new Diapers("Подгузник", 1200, 10.0, "шт.", 0, true, "L", 6, 14, "Открытые");
        printData(NewDiapers);
        // Соска
        Pacifier NewPacifier = new Pacifier("Соска", 60, 1.0, "шт.", 1, true);
        printData(NewPacifier);
        System.out.println("");
    }
}