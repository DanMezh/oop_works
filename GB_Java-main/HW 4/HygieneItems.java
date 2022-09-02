public class HygieneItems extends Product {
    private int quantity;

    /**
     * Товар - Предметы Гигиены
     * 
     * @param name     - наименования
     * @param price    - цена (в рублях), валюты не предусмотрены
     * @param amount   - количество
     * @param measure  - единица измерения
     * @param quantity - количество в упаковке
     */
    public HygieneItems(String name, String price, Double amount, String measure, int quantity) {
        super(name, price, amount, measure);
        this.quantity = quantity;
    }

    /**
     * Товар - Предметы Гигиены
     * 
     * @param name     - наименования
     * @param price    - цена (в рублях), валюты не предусмотрены
     * @param amount   - количество
     * @param measure  - единица измерения
     * @param quantity - количество в упаковке
     */
    public HygieneItems(String name, int price, Double amount, String measure, int quantity) {
        this(name, Integer.toString(price), amount, measure, quantity);
    }

    /**
     * Товар - Предметы Гигиены
     * 
     * @param name     - наименования
     * @param price    - цена (в рублях), валюты не предусмотрены
     * @param amount   - количество
     * @param measure  - единица измерения
     * @param quantity - количество в упаковке
     */
    public HygieneItems(String name, Double price, Double amount, String measure, int quantity) {
        this(name, Double.toString(price), amount, measure, quantity);
    }

    /**
     * Формруем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Количество в упаковке:[quantity]"
     */
    public String getInfo() {
        return super.getInfo() + ", Количество в упаковке: " + quantity + " шт.";
    }
}
