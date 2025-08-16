package revision_2;

//super Usage in Inheritance
//We already saw super earlier. Here’s an inheritance example:

class Animal4 {
    Animal4() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog4 extends Animal4 {
    Dog4() {
        super(); // calls Animal constructor
        System.out.println("Dog4 constructor");
    }

    void sound() {
        super.sound(); // calls parent method
        System.out.println("Dog4 barks");
    }
}

public class SuperInInheritance {
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.sound();
    }
}

/*
Animal constructor
Dog constructor
Animal makes sound
Dog barks


Key Takeaways (Inheritance)

Promotes code reusability.
Execution order: Parent constructor → Child constructor.
super lets child access parent fields, methods, constructors.

 */