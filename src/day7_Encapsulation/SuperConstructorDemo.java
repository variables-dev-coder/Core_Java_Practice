package day7_Encapsulation;


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor Called");
    }

    void displayPerson() {
        System.out.println("name: " + name + ", Age: " + age);
    }
}

class Candidet extends Person {
    int rollNo;

    Candidet(String name, int age, int rollNo) {
        super(name, age);  // calls Person's Constructor
        this.rollNo = rollNo;
        System.out.println("Candited Constructor Called");
    }

    void displayCandidet() {
        displayPerson();
        System.out.println("Roll No: " + rollNo);
    }
}
public class SuperConstructorDemo {
    public static void main(String[] args) {

        Candidet c1 = new Candidet("Munna", 29, 101);
        c1.displayCandidet();
    }
}
