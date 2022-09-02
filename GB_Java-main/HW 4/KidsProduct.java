/**
 * KidsProduct
 */
public class KidsProduct extends Product {
    private int minAge;
    private boolean hypoallergenic;

    /**
     * Товар - Детские товары
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     */
    public KidsProduct(String name, String price, Double amount, String measure, int minAge, boolean hypoallergenic) {
        super(name, price, amount, measure);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    /**
     * Товар - Детские товары
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     */
    public KidsProduct(String name, int price, Double amount, String measure, int minAge, boolean hypoallergenic) {
        this(name, Integer.toString(price), amount, measure, minAge, hypoallergenic);
    }

    /**
     * Товар - Детские товары
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     */
    public KidsProduct(String name, Double price, Double amount, String measure, int minAge, boolean hypoallergenic) {
        this(name, Double.toString(price), amount, measure, minAge, hypoallergenic);
    }

    /**
     * Формруем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Минимальный возраcт:
     *         [minAge], Гипоаллергеннсть: да/нет[hypoallergenic]"
     */
    public String getInfo() {
        return super.getInfo() + ", Минимальный возраcт: " + minAge + " лет, Гипоаллергеннсть: "
                + ((hypoallergenic) ? "Да" : "Нет");
    }

}