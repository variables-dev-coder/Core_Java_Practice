package revision_2;

/*
Abstraction

Abstraction = Hiding implementation details & showing only essential features.
In Java, it’s achieved by:

Abstract classes
Interfaces

(a) Abstract Class

Declared with abstract keyword.
Can have abstract methods (without body) + normal methods.
Cannot be instantiated directly.

Example:

 */

abstract class Animal6 {
    abstract void sound();  // abstract method

    void sleep() {          // normal method
        System.out.println("Sleeping...");
    }
}

class Dog6 extends Animal6 {
    void sound() {
        System.out.println("Dog6 barks");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Animal6 a = new Dog6(); // reference of abstract, object of child
        a.sound();
        a.sleep();
    }

}

/*
Dog barks
Sleeping...

 */