package revision_2;


class Person8 {
    void greet() {
        System.out.println("Hello from Person!");
    }
}

class Student8 extends Person8 {
    void greet() {
        System.out.println("Hello from Student!");
    }

    void show() {
        greet();        // calls child method
        super.greet();  // calls parent method
    }
}

public class SuperKeyWord2 {
    public static void main(String[] args) {
        Student8 s = new Student8();
        s.show();
    }

}

/*
Key Takeaways

this → current class object (fields, methods, constructors).
super → parent class object (fields, methods, constructors).
Execution order with constructors: Parent → Child.

 */