public class ToiletPaper extends HygieneItems {
    private int layersCount;

    /**
     * Товар - Предметы Гигиены - Туалетная бумага
     * 
     * @param name        - наименования
     * @param price       - цена (в рублях), валюты не предусмотрены
     * @param amount      - количество
     * @param measure     - единица измерения
     * @param quantity    - количество в упаковке
     * @param layersCount - количество слоёв
     */
    public ToiletPaper(String name, String price, Double amount, String measure, int quantity, int layersCount) {
        super(name, price, amount, measure, quantity);
        this.layersCount = layersCount;
    }

    /**
     * Товар - Предметы Гигиены - Туалетная бумага
     * 
     * @param name        - наименования
     * @param price       - цена (в рублях), валюты не предусмотрены
     * @param amount      - количество
     * @param measure     - единица измерения
     * @param quantity    - количество в упаковке
     * @param layersCount - количество слоёв
     */
    public ToiletPaper(String name, int price, Double amount, String measure, int quantity, int layersCount) {
        this(name, Integer.toString(price), amount, measure, quantity, layersCount);
    }

    /**
     * Товар - Предметы Гигиены - Туалетная бумага
     * 
     * @param name        - наименования
     * @param price       - цена (в рублях), валюты не предусмотрены
     * @param amount      - количество
     * @param measure     - единица измерения
     * @param quantity    - количество в упаковке
     * @param layersCount - количество слоёв
     */
    public ToiletPaper(String name, Double price, Double amount, String measure, int quantity, int layersCount) {
        this(name, Double.toString(price), amount, measure, quantity, layersCount);
    }

    /**
     * Формруем строковую запись полей [Товара]
     * 
     * @return - стоковое представление полей в формате "Наименование:[name],
     *         Цена:[price], Количество:[amount][measure], Количество в
     *         упаковке:[quantity], Кол-во слоёв: "
     */
    public String getInfo() {
        return super.getInfo() + ", Кол-во слоёв: " + layersCount;
    }
}
