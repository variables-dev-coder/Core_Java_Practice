package day30_Collection_basics;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class EmployeeSortExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Munna", 50000));
        employees.add(new Employee("Ravi", 70000));
        employees.add(new Employee("Amit", 60000));

        // Sort by salary (ascending)
        employees.sort(Comparator.comparingInt(e -> e.salary));

        System.out.println("Sorted by Salary: " + employees);

        // Sort by name (alphabetical)
        employees.sort(Comparator.comparing(e -> e.name));

        System.out.println("Sorted by Name: " + employees);
    }
}

//Sorted by Salary: [Munna - 50000, Amit - 60000, Ravi - 70000]
//Sorted by Name: [Amit - 60000, Munna - 50000, Ravi - 70000]