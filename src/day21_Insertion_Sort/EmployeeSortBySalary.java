package day21_Insertion_Sort;

// Given an array of Employee objects, sort them by salary in ascending order using Insertion Sort.

class Employee2 {
    String name;
    int id;
    double salary;

    Employee2(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}

public class EmployeeSortBySalary {

    public static void insertionSort(Employee2[] employees) {
        for (int i = 1; i < employees.length; i++) {
            Employee2 key = employees[i];
            int j = i - 1;

            // Compare salaries (numeric comparison)
            while (j >= 0 && employees[j].salary > key.salary) {
                employees[j + 1] = employees[j];
                j--;
            }

            employees[j + 1] = key; // Place employee at correct position
        }
    }

    public static void main(String[] args) {
        Employee2[] employees = {
                new Employee2("John", 101, 55000),
                new Employee2("Alice", 102, 60000),
                new Employee2("Bob", 103, 50000),
                new Employee2("David", 104, 70000)
        };

        System.out.println("Before Sorting:");
        for (Employee2 emp : employees) {
            System.out.println(emp);
        }

        insertionSort(employees);

        System.out.println("\nAfter Sorting by Salary:");
        for (Employee2 emp : employees) {
            System.out.println(emp);
        }
    }
}

/*
Dry Run
Initial Array (Salary Order)
[55000 (John), 60000 (Alice), 50000 (Bob), 70000 (David)]

Iteration 1 (i=1, key=60000)
55000 < 60000 → no shift.

[55000, 60000, 50000, 70000]

Iteration 2 (i=2, key=50000)
60000 > 50000 → shift 60000.

55000 > 50000 → shift 55000.

Insert 50000 → [50000, 55000, 60000, 70000]

Iteration 3 (i=3, key=70000)
60000 < 70000 → no shift.

[50000, 55000, 60000, 70000]

Sorted by Salary:
[50000 (Bob), 55000 (John), 60000 (Alice), 70000 (David)]
 */