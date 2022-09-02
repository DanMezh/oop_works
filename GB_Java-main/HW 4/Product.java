import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private Double amount;
    private String measure;

    /**
     * Товар
     * 
     * @param name    - наименования
     * @param price   - цена (в рублях), валюты не предусмотрены
     * @param amount  - количество
     * @param measure - единица измерения
     */
    public Product(String name, String price, Double amount, String measure) {
        BigDecimal realPrice = new BigDecimal(price);
        this.name = name;
        this.price = realPrice;
        this.amount = amount;
        this.measure = measure;
    }

    /**
     * Товар
     * 
     * @param name    - наименования
     * @param price   - цена (в рублях), валюты не предусмотрены
     * @param amount  - количество
     * @param measure - единица измерения
     */
    public Product(String name, int price, Double amount, String measure) {
        this(name, Integer.toString(price), amount, measure);
    }

    /**
     * Товар
     * 
     * @param name    - наименования
     * @param price   - цена (в рублях), валюты не предусмотрены
     * @param amount  - количество
     * @param measure - единица измерения
     */
    public Product(String name, Double price, Double amount, String measure) {
        this(name, Double.toString(price), amount, measure);
    }

    /**
     * Товар - без имени, без цены, без всего...
     * 
     * @param name    - "Без названия"
     * @param price   - 0.00 рублей
     * @param amount  - 0.0
     * @param measure - "шт."
     */
    public Product() {
        this("Без названия", 0, 0.0, "шт.");
    }

    /**
     * Формруем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure]"
     */
    public String getInfo() {
        String priceStr = price.toString();
        return String.format("Наименование: %s, Цена: %s, Количество: %.2f %s", name, priceStr, amount, measure);
    }

    /**
     * Возвращаем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure]"
     */
    @Override
    public String toString() {
        return this.getInfo();
    }
}
