package revision_2;

/*
(b) Interface

100% abstraction (before Java 8).
From Java 8: Interfaces can also have default & static methods.
Supports multiple inheritance.

Example:

 */

interface Vehicle2 {
    void start(); // abstract method

    default void stop() {   // Java 8+ default method
        System.out.println("Vehicle2 stopped");
    }

    static void service() { // Java 8+ static method
        System.out.println("Vehicle service check");
    }
}

class Car2 implements Vehicle2 {
    public void start() {
        System.out.println("Car starts");
    }
}

public class InterfaceAbstract {
    public static void main(String[] args) {
        Car2 c = new Car2();
        c.start();   // implemented
        c.stop();    // default method
        Vehicle2.service(); // static method
    }

}

/*
Car starts
Vehicle stopped
Vehicle service check


 */