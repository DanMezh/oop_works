public class Masks extends HygieneItems {
    /**
     * Товар - Предметы Гигиены
     * 
     * @param name     - наименования
     * @param price    - цена (в рублях), валюты не предусмотрены
     * @param amount   - количество
     * @param measure  - единица измерения
     * @param quantity - количество в упаковке
     */
    public Masks(String name, String price, Double amount, String measure, int quantity) {
        super(name, price, amount, measure, quantity);
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
    public Masks(String name, int price, Double amount, String measure, int quantity) {
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
    public Masks(String name, Double price, Double amount, String measure, int quantity) {
        this(name, Double.toString(price), amount, measure, quantity);
    }

    /**
     * Формруем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Количество в
     *         упаковке:[quantity]"
     */
    public String getInfo() {
        return super.getInfo();
    }
}
