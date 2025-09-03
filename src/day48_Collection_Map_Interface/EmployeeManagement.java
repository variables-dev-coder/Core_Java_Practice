package day48_Collection_Map_Interface;


import java.util.*;

// Employee class
class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " → " + name + " (" + department + "), Salary: " + salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Map: employeeId → Employee object
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Adding employees
        employeeMap.put(101, new Employee(101, "Alice", "IT", 60000));
        employeeMap.put(102, new Employee(102, "Bob", "HR", 50000));
        employeeMap.put(103, new Employee(103, "Charlie", "Finance", 70000));

        // Print all employees
        System.out.println("All Employees:");
        for (Employee emp : employeeMap.values()) {
            System.out.println(emp);
        }

        // Search employee by id
        int searchId = 102;
        System.out.println("\nSearching employee with id " + searchId + ":");
        System.out.println(employeeMap.get(searchId));

        // Update employee salary
        Employee emp = employeeMap.get(103);
        emp.salary = 75000;
        employeeMap.put(103, emp);

        System.out.println("\nAfter salary update for 103:");
        System.out.println(employeeMap.get(103));

        // Delete employee
        employeeMap.remove(101);
        System.out.println("\nAfter removing employee 101:");
        System.out.println(employeeMap);
    }
}

/*
Logic:
    Create an Employee class with id, name, department, salary.
    Use HashMap<Integer, Employee> → Key = employeeId, Value = Employee object.
    Perform operations like:
        Add new employee
        Search employee by id
        Update employee salary
        Delete employee

Output

All Employees:
101 → Alice (IT), Salary: 60000.0
102 → Bob (HR), Salary: 50000.0
103 → Charlie (Finance), Salary: 70000.0

Searching employee with id 102:
102 → Bob (HR), Salary: 50000.0

After salary update for 103:
103 → Charlie (Finance), Salary: 75000.0

After removing employee 101:
{102=102 → Bob (HR), Salary: 50000.0, 103=103 → Charlie (Finance), Salary: 75000.0}




 */