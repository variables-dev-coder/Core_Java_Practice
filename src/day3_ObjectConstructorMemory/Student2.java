package day3_ObjectConstructorMemory;

public class Student2 {
    String name;
    int age;

    Student2(){
        this("Unknown", 0); // calls parameterized constructor
        System.out.println("Default Constructor Called");
    }

    Student2(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parametrized Constructor Called");
    }

    void display(){
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.display();
    }
}
