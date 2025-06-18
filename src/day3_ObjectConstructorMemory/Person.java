package day3_ObjectConstructorMemory;

public class Person {
    String name;
    int age;

    // Default Constructor
    Person(){
        name = "Not Given";
        age = 0;

    }

    // Parametrized Constructor
    Person(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();  // Calls default Constructor
        Person p2 = new Person("Munna", 30); // Parametrized Constructor

        p1.display();
        p2.display();
    }
}
