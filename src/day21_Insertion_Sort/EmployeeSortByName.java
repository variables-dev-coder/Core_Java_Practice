package day21_Insertion_Sort;

// Given an array of employees, sort them by name using Insertion Sort (without using built-in sort methods).

class Employee {
    String name;
    int id;
    double salary;

    Employee (String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", sal;ary=" + salary +"}";
    }
}

public class EmployeeSortByName {
    public static void insertionSort(Employee[] employees) {
        for (int i = 1; i < employees.length; i++) {
            Employee key = employees[i];
            int j = i - 1;

            // Compare employee names using compareTo()
            while (j >= 0 && employees[j].name.compareTo(key.name) > 0) {
                employees[j + 1] = employees[j];
                j--;
            }
            employees[j + 1] = key;  // Place key at correct position
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Emma", 101, 440000),
                new Employee("Alice", 102, 34000),
                new Employee("Bob", 103, 55000),
                new Employee("Tom", 104, 23000),
                new Employee("David", 105, 63000),
                new Employee("Zoya", 106, 85000)
        };

        System.out.println("Before Sorting: ");
        for (Employee emp : employees) {
            System.out.print(emp + " ");
        }

        insertionSort(employees);

        System.out.println("\nAfter Sorting: ");
        for (Employee emp : employees) {
            System.out.print(emp);
        }
    }
}

/*

Dry Run
Initial Order
[John, Alice, Bob, David]

Iteration 1 (i=1, key="Alice")
Compare "John".compareTo("Alice") > 0 → shift John.

Insert Alice → [Alice, John, Bob, David]

Iteration 2 (i=2, key="Bob")
Compare "John".compareTo("Bob") > 0 → shift John.

Compare "Alice".compareTo("Bob") < 0 → stop.

Insert Bob → [Alice, Bob, John, David]

Iteration 3 (i=3, key="David")
Compare "John".compareTo("David") > 0 → shift John.

Compare "Bob".compareTo("David") < 0 → stop.

Insert David → [Alice, Bob, David, John]

Sorted by Name: [Alice, Bob, David, John]


 */