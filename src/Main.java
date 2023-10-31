//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник
//        должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ronald", "89111231212", 1);
        Employee emp2 = new Employee(2, "Harry", "89111231313", 2);
        Employee emp3 = new Employee(3, "Hermione", "89111231414", 3);

        System.out.println("Список сотрудников");
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmloyee(emp1);
        employeeBook.addEmloyee(emp2);
        employeeBook.addEmloyee(emp3);
        System.out.println(employeeBook.printEmployeeBook());

        System.out.println("Поиск по стажу");
        // Мой метод возвращает список всех сотрудников, чей стаж равен или больше параметра (2 года в примере)
        List<Employee> tempList = employeeBook.getEmployeeByExperience(2);
        for (Employee elem : tempList) {
            System.out.println(elem.toString());
        }

        System.out.println("\nНомер по имени");
        // Мой метод возвращает номер по имени. Без списков. Не совсем понял по заданию, какие списки имелись в виду.
        System.out.println(employeeBook.getPhoneNumberByName("Harry"));

        System.out.println("\nСотрудник по табельному номеру");
        System.out.println(employeeBook.getEmployeeByID(1).toString());
    }
}