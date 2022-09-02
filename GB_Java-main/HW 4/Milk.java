import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Milk extends Drink {

    private int fatPercent;
    private Date dateOfExpiry;

    /**
     * Товар - Напиток - Молоко
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param volume       - объём в литрах (единицы измерения объёма не
     *                     предусмотрены)
     * @param fatPercent   - % жирности в виде целого числа
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     */
    public Milk(String name, String price, Double amount, String measure, Double volume, int fatPercent,
            String dateOfExpiry) throws Exception {
        super(name, price, amount, measure, volume);
        this.fatPercent = fatPercent;
        this.dateOfExpiry = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfExpiry);
    }

    /**
     * Товар - Напиток - Молоко
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param volume       - объём в литрах (единицы измерения объёма не
     *                     предусмотрены)
     * @param fatPercent   - % жирности в виде целого числа
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     */
    public Milk(String name, int price, Double amount, String measure, Double volume, int fatPercent,
            String dateOfExpiry) throws Exception {
        this(name, Integer.toString(price), amount, measure, volume, fatPercent, dateOfExpiry);
    }

    /**
     * Товар - Напиток - Молоко
     * 
     * @param name         - наименования
     * @param price        - цена (в рублях), валюты не предусмотрены
     * @param amount       - количество
     * @param measure      - единица измерения
     * @param volume       - объём в литрах (единицы измерения объёма не
     *                     предусмотрены)
     * @param fatPercent   - % жирности в виде целого числа
     * @param dateOfExpiry - срок годности строка в формате день/месяц/год в виде
     *                     цифр. Пример: "31/12/2028"
     */
    public Milk(String name, Double price, Double amount, String measure, Double volume, int fatPercent,
            String dateOfExpiry) throws Exception {
        this(name, Double.toString(price), amount, measure, volume, fatPercent, dateOfExpiry);
    }

    /**
     * Возвращаем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Объём:
     *         [volume], Жирность: [fatPercent]% ,Срок годности до: [dateOfExpiry]"
     */
    @Override
    public String getInfo() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return super.getInfo() + ", Жирность: " + fatPercent + "% , Срок годности до: "
                + dateFormat.format(dateOfExpiry);
    }
}
