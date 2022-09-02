
/**
 * Класс Сотрудник
 */
public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private Integer standing;
    private String position;
    /**
     * Создаём сотрудника
     * @param surname - фаимия
     * @param name - имя
     * @param patronymic - отчество
     * @param standing - стаж
     * @param position - должность
     */
    public Employee(String surname, String name, String patronymic, int standing, String position){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.standing = standing;
        this.position = position;
    }

    public Employee(){
        this("Чьё","Чья","Кого",0,"Безработный");
    }

    public String getInfo(){
        return String.format("Фамилия: %s\nИмя: %s\nОтчество: %s\nСтаж: %d\nДолжность: %s\n",this.name, this.surname, this.patronymic, this.standing, this.position);            
    }

    @Override
    public String toString(){
        return this.getInfo();
    }
}