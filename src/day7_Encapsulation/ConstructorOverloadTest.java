package day7_Encapsulation;


class Employee {

    String name;
    int age;

    // Default constructor
    Employee () {
        name = "Unknown";
        age = 0;
    }

    // Constructor with name
    Employee (String name) {
        this.name = name;
        this.age = 18;
    }

    // Constructor with name and age
    Employee (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " - " + age);
    }
}

public class ConstructorOverloadTest {
    public static void main(String[] args) {

        Employee e1 = new Employee();                 // calls default
        Employee e2 = new Employee("Munna");    // name only
        Employee e3 = new Employee("Munna", 30);   // name + age

        e1.show();
        e2.show();
        e3.show();
    }
}
