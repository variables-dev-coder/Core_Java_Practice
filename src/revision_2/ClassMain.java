package revision_2;

/*
1. Defining Classes
A class is a blueprint/template that defines variables (fields) and methods (functions).
It does not allocate memory until we create an object.

2. Creating Objects
An object is an instance of a class. Memory is allocated when we use new.

 */


// Class definition
class Car {
    // Fields (attributes)
    String brand;
    int speed;

    // Method (behavior)
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class ClassMain {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car();
        Car car2 = new Car();

        // Initializing object fields
        car1.brand = "Tesla";
        car1.speed = 120;

        car2.brand = "BMW";
        car2.speed = 150;

        // Calling methods
        car1.drive();
        car2.drive();
    }
}

/*
Tesla is driving at 120 km/h
BMW is driving at 150 km/h


Key Points:

Class → Blueprint (no memory until object is created).
Object → Real entity (created using new).
Multiple objects can be created from the same class.
 */