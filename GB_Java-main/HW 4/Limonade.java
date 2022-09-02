public class Limonade extends Drink{
    /**
     * Товар - Напиток - Лимонад
     * 
     * @param name    - наименования
     * @param price   - цена (в рублях), валюты не предусмотрены
     * @param amount  - количество
     * @param measure - единица измерения
     * @param volume  - объём в литрах (единицы измерения объёма не предусмотрены)
     */
    public Limonade(String name, String price, Double amount, String measure, Double volume) throws Exception {
        super(name, price, amount, measure, volume);
    }

    /**
     * Товар - Напиток - Лимонад
     * 
     * @param name    - наименования
     * @param price   - цена (в рублях), валюты не предусмотрены
     * @param amount  - количество
     * @param measure - единица измерения
     * @param volume  - объём в литрах (единицы измерения объёма не предусмотрены)
     */
    public Limonade(String name, int price, Double amount, String measure, Double volume) throws Exception {
        this(name, Integer.toString(price), amount, measure, volume);
    }

    /**
     * Товар - Напиток - Лимонад
     * 
     * @param name    - наименования
     * @param price   - цена (в рублях), валюты не предусмотрены
     * @param amount  - количество
     * @param measure - единица измерения
     * @param volume  - объём в литрах (единицы измерения объёма не предусмотрены)
     */
    public Limonade(String name, Double price, Double amount, String measure, Double volume) throws Exception {
        this(name, Double.toString(price), amount, measure, volume);
    }

    /**
     * Возвращаем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Объём:
     *         [volume]"
     */
    @Override
    public String getInfo() {
        return super.getInfo();
    }

}
