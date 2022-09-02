public class Diapers extends KidsProduct {

    private String size;
    private int minWeight;
    private int maxWeight;
    private String type;

    /**
     * Товар - Детские товары - Подгузник
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     * @param size           - размер буквенное обозначение S/M/L/XL
     * @param minWeight      - минимальный вес кг - окргленное до целых
     * @param maxWeight      - максимальный вес кг - окргленное до целых
     * @param type           - тип подгузника, строка «открытые» (анатомические)
     *                       подгузники «полуоткрытые» (поясные) подгузники для
     *                       взрослых «закрытые» (классические) подгузники для
     *                       взрослых
     */
    public Diapers(String name, String price, Double amount, String measure, int minAge, boolean hypoallergenic,
            String size, int minWeight, int maxWeight, String type) {
        super(name, price, amount, measure, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    /**
     * Товар - Детские товары - Подгузник
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     * @param size           - размер буквенное обозначение S/M/L/XL
     * @param minWeight      - минимальный вес кг - окргленное до целых
     * @param maxWeight      - максимальный вес кг - окргленное до целых
     * @param type           - тип подгузника, строка «открытые» (анатомические)
     *                       подгузники «полуоткрытые» (поясные) подгузники для
     *                       взрослых «закрытые» (классические) подгузники для
     *                       взрослых
     */
    public Diapers(String name, int price, Double amount, String measure, int minAge, boolean hypoallergenic,
            String size,
            int minWeight, int maxWeight, String type) {
        this(name, Integer.toString(price), amount, measure, minAge, hypoallergenic, size, minWeight, maxWeight, type);
    }

    /**
     * Товар - Детские товары - Подгузник
     * 
     * @param name           - наименованиe String
     * @param price          - цена (в рублях), валюты не предусмотрены
     * @param amount         - количество Double
     * @param measure        - единица измерения
     * @param minAge         - минимальный возраст "Лет"
     * @param hypoallergenic - гипоаллергенный true - да, false - нет
     * @param size           - размер буквенное обозначение S/M/L/XL
     * @param minWeight      - минимальный вес кг - окргленное до целых
     * @param maxWeight      - максимальный вес кг - окргленное до целых
     * @param type           - тип подгузника, строка «открытые» (анатомические)
     *                       подгузники «полуоткрытые» (поясные) подгузники для
     *                       взрослых «закрытые» (классические) подгузники для
     *                       взрослых
     */
    public Diapers(String name, Double price, Double amount, String measure, int minAge, boolean hypoallergenic,
            String size, int minWeight, int maxWeight, String type) {
        this(name, Double.toString(price), amount, measure, minAge, hypoallergenic, size, minWeight, maxWeight, type);
    }

    /**
     * Формруем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Минимальный возраcт:
     *         [minAge], Гипоаллергеннсть: да/нет[hypoallergenic], Размер:[size], Разрешённый вес:[minWeight]-[maxWeight], Тип:[type]"
     */
    public String getInfo() {
        return super.getInfo() + ", Размер:" + size + ", Разрешённый вес: " + minWeight + "-" + maxWeight+ "кг , Тип: " + type;
    }

}
