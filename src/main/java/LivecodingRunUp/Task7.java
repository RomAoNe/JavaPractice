package LivecodingRunUp;

import java.util.*;
import java.util.stream.Collectors;

/*
    Среднюю зарплату сотрудников старше 30 лет в департаменте "IT"
    Список имён сотрудников из департамента "Sales" с зарплатой выше 70 000, отсортированный по убыванию зарплаты
    Группировку сотрудников по департаментам с указанием минимальной, максимальной и средней зарплаты в каждом
 */

public class Task7 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Анна", 28, "IT", 85000),
                new Employee("Борис", 35, "IT", 120000),
                new Employee("Виктория", 32, "IT", 95000),
                new Employee("Глеб", 41, "Sales", 78000),
                new Employee("Дарья", 29, "Sales", 65000),
                new Employee("Евгений", 33, "Sales", 82000),
                new Employee("Зоя", 45, "HR", 70000)
        );

//        System.out.println(getAverageSalary(employees));
//        System.out.println(getList(employees));
        System.out.println(getEmployees(employees));
    }

    public static OptionalDouble getAverageSalary(List<Employee> employees) {
        OptionalDouble average = employees.stream()
                .filter(e -> e.getAge() > 30 && e.getDepartment().equals("IT"))
                .mapToDouble(Employee::getSalary)
                .average();

        return average;
    }

    public static List<String> getList(List<Employee> employees){
         List<String> newList = employees.stream()
                .filter(e -> e.getDepartment().equals("Sales") && e.getSalary() > 70000)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getName)
                .toList();

         return newList;
    }

    public static Map<String, DoubleSummaryStatistics> getEmployees(List<Employee>employees){
        Map<String, DoubleSummaryStatistics> newMap = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summarizingDouble(Employee::getSalary)
                ));

        return newMap;
    }
}