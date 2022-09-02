import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Employee> subworkers;
    private int managerLevel;

    public Manager(String surname, String name, String patronymic, int standing, String position, int managerLevel) {
        super(surname, name, patronymic, standing, position);
        this.managerLevel = managerLevel;
        this.subworkers = new ArrayList<Employee>();
    }

    public void addSubworker(Employee employee) {
        subworkers.add(employee);
    }

    public void removeSubwoker(Employee employee) {
        subworkers.remove(employee);
    }

    public String getSubworkers() {
        String result = "Подчинённые: {";
        if (!subworkers.isEmpty()) {
            for (Employee employee : subworkers) {
                result +=  "\n" + employee.getInfo();
            }
        } else {
            result += "Нет";
        }

        return result + "}\n";
    }

    @Override
    public String toString() {
        return super.getInfo() + "\n" + getSubworkers();
    }
}
