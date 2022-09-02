public class Eggs extends Food {
    private int quantity;

    /**
     * Товар - Продукты питания - Яйца
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     * @param quantity     - количество в упаковке
     */
    public Eggs(String name, String price, Double amount, String measure, String dateOfExpiry, int quantity)
            throws Exception {
        super(name, price, amount, measure, dateOfExpiry);
        this.quantity = quantity;
    }

    /**
     * Товар - Продукты питания - Яйца
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     * @param quantity     - количество в упаковке
     */
    public Eggs(String name, int price, Double amount, String measure, String dateOfExpiry, int quantity)
            throws Exception {
        this(name, Integer.toString(price), amount, measure, dateOfExpiry, quantity);
    }

    /**
     * Товар - Продукты питания - Яйца
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     * @param quantity     - количество в упаковке
     */
    public Eggs(String name, Double price, Double amount, String measure, String dateOfExpiry, int quantity)
            throws Exception {
        this(name, Double.toString(price), amount, measure, dateOfExpiry, quantity);
    }

    /**
     * Возвращаем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Срок годности до:
     *         [dateOfExpiry], Количество в упаковке:[quantity]"
     */
    @Override
    public String getInfo() {
        return super.getInfo() + ", Количество в упаковке: " + quantity + " шт.";
    }
}
