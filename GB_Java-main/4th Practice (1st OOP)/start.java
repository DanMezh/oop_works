public class start {
    public static void main(String[] args) {
        Employee person1 = new Employee("Александров", "Александр", "Алесандрович", 10, "Тыж программист");
        Employee person2 = new Employee("Иванов", "Иван", "Иванович", 5, "Айтишник");
        Employee person3 = new Employee("Сергеев", "Сергей", "Сергеевич", 8, "Продавец");
        Employee personX = new Employee();
        System.out.println("--- Работник 1 ---");
        System.out.println(person1);
        System.out.println("--- Работник 2 ---");
        System.out.println(person2);
        System.out.println("--- Работник 3 ---");
        System.out.println(person3);
        System.out.println("--- Работник 4 ---");
        System.out.println(personX);

        Manager manager1 = new Manager("Игорев", "Игорь", "Игоревич", 5, "Лидер",3);
        System.out.println("--- Менеджер 1 ---");
        System.out.println(manager1);
        manager1.addSubworker(person1);
        manager1.addSubworker(person2);
        System.out.println("--- Менеджер 1 с 2 сотрудниками --- ");
        System.out.println(manager1);
        manager1.addSubworker(person3);
        manager1.addSubworker(personX);
        System.out.println("--- Менеджер 1 с 4 сотрудникам ---");
        System.out.println(manager1);
        manager1.removeSubwoker(personX);
        System.out.println("--- Менеджер 1 с 3 сотрудникам ---");
        System.out.println(manager1);
    }
}

