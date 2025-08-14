package day1_basics;


// Parent class
class Vehicle5 {
    String brand;

    Vehicle5(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting...");
    }
}

// Child class 1
class Car5 extends Vehicle5 {
    int doors;

    Car5(String brand, int doors) {
        super(brand); // calling parent constructor
        this.doors = doors;
    }

    void honk() {
        System.out.println(brand + " car is honking!");
    }
}

// Child class 2
class Bike5 extends Vehicle5 {
    boolean hasGear;

    Bike5(String brand, boolean hasGear) {
        super(brand);
        this.hasGear = hasGear;
    }

    void wheelie() {
        System.out.println(brand + " bike is doing a wheelie!");
    }
}

// Main class to test
public class OOPExample5 {
    public static void main(String[] args) {
        // Parent class object
        Vehicle5 v = new Vehicle5("Generic Vehicle");
        v.start();
        // v.honk(); // Not possible (only Vehicle methods are available)

        // Child class object - Car
        Car5 c = new Car5("Toyota", 4);
        c.start(); // inherited from Vehicle
        c.honk();  // specific to Car

        // Child class object - Bike
        Bike5 b = new Bike5("Yamaha", true);
        b.start();   // inherited
        b.wheelie(); // specific to Bike

        // Parent reference holding child object (Upcasting)
        Vehicle5 ref = new Car5("Honda", 4);
        ref.start();
        // ref.honk(); // Not accessible without downcasting
    }

}
/*
When to create each object
Parent class object → When you need only common features that all subclasses share.
Child class object → When you need both common features and extra features specific to that child.
Parent reference with child object (upcasting) → When you want to handle multiple types uniformly
(like in polymorphism).

 */