public class Pacifier extends KidsProduct {
    /**
     * Товар - Детские товары - Соска
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     */
    public Pacifier(String name, String price, Double amount, String measure, int minAge, boolean hypoallergenic) {
        super(name, price, amount, measure, minAge, hypoallergenic);
    }

    /**
     * Товар - Детские товары - Соска
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     */
    public Pacifier(String name, int price, Double amount, String measure, int minAge, boolean hypoallergenic) {
        this(name, Integer.toString(price), amount, measure, minAge, hypoallergenic);
    }

    /**
     * Товар - Детские товары - Соска
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     */
    public Pacifier(String name, Double price, Double amount, String measure, int minAge, boolean hypoallergenic) {
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
        return super.getInfo();
    }
}
