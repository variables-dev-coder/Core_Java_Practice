package revision_2;

/*
super keyword

Refers to immediate parent class object.
Uses:

To call parent class constructor.
To access parent class fields (if hidden).
To access parent class methods (if overridden).

 */

class Person7 {
    String name = "Parent Name";
}

class Student7 extends Person7 {
    String name = "Child Name";

    void show() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
        Student7 s = new Student7();
        s.show();
    }

}

/*
Child name: Child Name
Parent name: Parent Name


 */