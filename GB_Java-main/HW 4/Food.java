import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Food extends Product {

    private Date dateOfExpiry;

    /**
     * Товар - Продукты питания
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     */
    public Food(String name, String price, Double amount, String measure, String dateOfExpiry) throws Exception {
        super(name, price, amount, measure);
        this.dateOfExpiry = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfExpiry);
    }

    /**
     * Товар - Продукты питания
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     */
    public Food(String name, int price, Double amount, String measure, String dateOfExpiry) throws Exception {
        this(name, Integer.toString(price), amount, measure, dateOfExpiry);
    }

    /**
     * Товар - Продукты питания
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     */
    public Food(String name, Double price, Double amount, String measure, String dateOfExpiry) throws Exception {
        this(name, Double.toString(price), amount, measure, dateOfExpiry);
    }

    /**
     * Возвращаем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Срок годности до:
     *         [dateOfExpiry]"
     */
    @Override
    public String getInfo() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return super.getInfo() + ", Срок годности до: " + dateFormat.format(dateOfExpiry);
    }

}
