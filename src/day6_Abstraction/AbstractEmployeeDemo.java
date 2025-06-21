package day6_Abstraction;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void displaySalary() {
        System.out.println(name + "'s Salary: ₹" + calculateSalary());
    }
}

// FullTimeEmployee subclass

class FullTimeEmployee extends Employee {
    double basicSalary;

    FullTimeEmployee(String name, double basicSalary) {
        super(name);
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary + 5000; // fixed bonus
    }
}

// PartTimeEmployee subclass

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class AbstractEmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Munna", 25000);
        Employee e2 = new PartTimeEmployee("Aziz", 80, 300);

        e1.displaySalary();  // Munna's Salary: ₹30000.0
        e2.displaySalary();  // Aziz's Salary: ₹24000.0
    }
}
