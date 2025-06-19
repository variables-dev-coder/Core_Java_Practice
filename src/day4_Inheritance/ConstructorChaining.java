package day4_Inheritance;


class Person2 {
    String name;

    Person2(String name){
        this.name = name;
        System.out.println("Person constructor called");
    }

    void display(){
        System.out.println("Name: " + name);
    }
}

class Employee extends Person2 {
    int empId;

    Employee(String name, int empId){
        super(name);  // Call Parent2 constructor
        this.empId = empId;
        System.out.println("Employee constructor called");
    }

    void display(){
        super.display(); // Optionally call parent display()
        System.out.println("Employee ID: " + empId);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Employee e1 = new Employee("Munna", 101);
        e1.display();
    }
}
