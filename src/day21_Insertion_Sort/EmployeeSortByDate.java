package day21_Insertion_Sort;

// We have an array of employees with a joiningDate field. We need to sort them earliest to latest.

import java.time.LocalDate;

class Employee4 {
    String name;
    int id;
    double salary;
    LocalDate joiningDate;

    Employee4(String name, int id, double salary, LocalDate joiningDate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee4{name='" + name + "', id=" + id + ", salary=" + salary +
                ", joiningDate=" + joiningDate + "}";
    }
}

public class EmployeeSortByDate {

    public static void insertionSortByDate(Employee4[] employees) {
        for (int i = 1; i < employees.length; i++) {
            Employee4 key = employees[i];
            int j = i - 1;

            // Compare dates (earliest first)
            while (j >= 0 && employees[j].joiningDate.isAfter(key.joiningDate)) {
                employees[j + 1] = employees[j];
                j--;
            }

            employees[j + 1] = key; // Place at correct position
        }
    }

    public static void main(String[] args) {
        Employee4[] employees = {
                new Employee4("John", 101, 55000, LocalDate.of(2022, 5, 15)),
                new Employee4("Alice", 102, 60000, LocalDate.of(2021, 8, 20)),
                new Employee4("Bob", 103, 50000, LocalDate.of(2023, 1, 10)),
                new Employee4("David", 104, 70000, LocalDate.of(2020, 12, 5))
        };

        System.out.println("Before Sorting:");
        for (Employee4 emp : employees) {
            System.out.println(emp);
        }

        insertionSortByDate(employees);

        System.out.println("\nAfter Sorting by Joining Date (Earliest First):");
        for (Employee4 emp : employees) {
            System.out.println(emp);
        }
    }
}

/*

Dry Run
Initial Order by Date:
John → 2022-05-15
Alice → 2021-08-20
Bob → 2023-01-10
David → 2020-12-05

Iteration 1 (i=1, key=Alice, 2021-08-20)
Compare John (2022-05-15) is after Alice (2021-08-20) → shift John.

Insert Alice → [Alice, John, Bob, David]

Iteration 2 (i=2, key=Bob, 2023-01-10)
Compare John (2022-05-15) is after Bob? No → no shift.

Iteration 3 (i=3, key=David, 2020-12-05)
Compare Bob (2023-01-10) after David → shift Bob.

Compare John (2022-05-15) after David → shift John.

Compare Alice (2021-08-20) after David → shift Alice.

Insert David → [David, Alice, John, Bob]

Sorted by Date (Earliest First):
David (2020-12-05)
Alice (2021-08-20)
John (2022-05-15)
Bob (2023-01-10)
 */