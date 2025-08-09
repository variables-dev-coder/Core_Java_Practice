package revisaion_Core_Oop;

/*

1. Class & Object in Java
Theory
Class: A blueprint/template to create objects.
Object: An instance of a class — it has state (variables) and behavior (methods).
Syntax:
class ClassName {
    // variables (state)
    // methods (behavior)
}

You can create multiple objects from a single class.
 */

class Car {
    String color;
    String model;

    void start() {
        System.out.println(model + " is starting.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Tesla";

        Car car2 = new Car();
        car2.color = "Blue";
        car2.model = "BMW";

        car1.start();
        car2.start();
    }
}
//Tesla is starting.
//BMW is starting.