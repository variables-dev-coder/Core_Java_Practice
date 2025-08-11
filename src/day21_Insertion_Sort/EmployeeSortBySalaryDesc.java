package day21_Insertion_Sort;


class Employee3 {
    String name;
    int id;
    double salary;

    Employee3(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee3{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}

public class EmployeeSortBySalaryDesc {

    public static void insertionSortDescending(Employee3[] employees) {
        for (int i = 1; i < employees.length; i++) {
            Employee3 key = employees[i];
            int j = i - 1;

            // Reverse condition for descending: higher salaries first
            while (j >= 0 && employees[j].salary < key.salary) {
                employees[j + 1] = employees[j];
                j--;
            }

            employees[j + 1] = key; // Place at correct position
        }
    }

    public static void main(String[] args) {
        Employee3[] employees = {
                new Employee3("John", 101, 55000),
                new Employee3("Alice", 102, 60000),
                new Employee3("Bob", 103, 50000),
                new Employee3("David", 104, 70000)
        };

        System.out.println("Before Sorting:");
        for (Employee3 emp : employees) {
            System.out.println(emp);
        }

        insertionSortDescending(employees);

        System.out.println("\nAfter Sorting by Salary (Descending):");
        for (Employee3 emp : employees) {
            System.out.println(emp);
        }
    }
}

/*
Dry Run
Initial Salaries:
[55000 (John), 60000 (Alice), 50000 (Bob), 70000 (David)]

Iteration 1 (i=1, key=60000)
Compare 55000 < 60000 → shift 55000.

Insert 60000 → [60000, 55000, 50000, 70000]

Iteration 2 (i=2, key=50000)
Compare 55000 < 50000? No → stop.

[60000, 55000, 50000, 70000]

Iteration 3 (i=3, key=70000)
Compare 50000 < 70000 → shift 50000.

Compare 55000 < 70000 → shift 55000.

Compare 60000 < 70000 → shift 60000.

Insert 70000 → [70000, 60000, 55000, 50000]

Sorted by Salary Descending:
[70000 (David), 60000 (Alice), 55000 (John), 50000 (Bob)]

 */