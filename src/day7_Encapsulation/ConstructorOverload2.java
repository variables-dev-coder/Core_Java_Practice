package day7_Encapsulation;

class Employee2 {
    String name;
    int id;
    double salary;

    // Default constructor
    Employee2 () {
        name = "Unknown";
        id = 0;
        salary = 0.0;
    }

    // Constructor with name
    Employee2 (String name) {
        this.name = name;
        this.id = 101;
        this.salary = 15000;
    }

    // Constructor with name and id
    Employee2(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 16000;
    }

    // Constructor with name id and salary
    Employee2(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void showDisplay() {
        System.out.println("Name: " + name + " Id: " + id + " Salary: " + salary);
    }
}
public class ConstructorOverload2 {
    public static void main(String[] args) {

        Employee2 e2 = new Employee2();   // Default Constructor
        Employee2 e3 = new Employee2("Munna");  // Name only
        Employee2 e4 = new Employee2("Pooja", 110);  // Name and id
        Employee2 e5 = new Employee2("Joy", 115, 17000);  // Name id snd salary

        e2.showDisplay();
        e3.showDisplay();
        e4.showDisplay();
        e5.showDisplay();

    }
}
