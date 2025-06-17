package day2_OPP;


class Employee {
    int id;
    String name;

    // Default Constructor
    Employee(){
        System.out.println("Default Constructor Called");
        id = 0;
        name = "Not Assigned";
    }

    // Parameterized Constructor
    Employee(int i, String n){
        System.out.println("Parameterized Constructor Called");
        id = i;
        name = n;
    }
    void display(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // Default Constructor
        e1.display();

        Employee e2 = new Employee(101, "Munna");  // Parameterized Constructor
        e2.display();
    }
}
