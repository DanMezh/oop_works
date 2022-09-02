public class Bread extends Food {

    private String flourType;

    /**
     * Товар - Продукты питания - Хлеб
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     * @param flourType    - тип муки
     */
    public Bread(String name, String price, Double amount, String measure, String dateOfExpiry, String flourType)
            throws Exception {
        super(name, price, amount, measure, dateOfExpiry);
        this.flourType = flourType;
    }

    /**
     * Товар - Продукты питания - Хлеб
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     * @param flourType    - тип муки
     */
    public Bread(String name, Double price, Double amount, String measure, String dateOfExpiry, String flourType)
            throws Exception {
        this(name, Double.toString(price), amount, measure, dateOfExpiry, flourType);
    }

    /**
     * Товар - Продукты питания - Хлеб
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     * @param flourType    - тип муки
     */
    public Bread(String name, int price, Double amount, String measure, String dateOfExpiry, String flourType)
            throws Exception {
        this(name, Integer.toString(price), amount, measure, dateOfExpiry, flourType);
    }

    /**
     * Возвращаем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Срок годности до:
     *         [dateOfExpiry], Тип муки: [flourType]"
     */
    @Override
    public String getInfo() {
        return super.getInfo() + ", Тип муки: " + flourType;
    }

}
