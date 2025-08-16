package revision_2;

/*
final Keyword in Polymorphism
final variable → constant, cannot be changed.
final method → cannot be overridden.
final class → cannot be inherited.

Example:

 */

final class Vehicle1 {
    final int speedLimit = 100;

    final void run() {
        System.out.println("Vehicle1 is running at limit " + speedLimit);
    }
}

// cannot extend final class
// class Car extends Vehicle {}


public class FinalKeyWordInPolymorphism {
    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.run();
    }
}


/*
Key Takeaways (Polymorphism)

Overloading (Compile-time) = Same method name, different parameters.
Overriding (Runtime) = Child provides its own implementation of parent method.
final restricts overriding or inheritance.


 */