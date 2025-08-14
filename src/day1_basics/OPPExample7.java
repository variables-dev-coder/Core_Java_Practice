package day1_basics;



// Parent Class
class Vehicle7 {
    String brand;
    int year;

    Vehicle7(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void start() {
        System.out.println(brand + " is starting...");
    }

    void stop() {
        System.out.println(brand + " is stopping...");
    }
}

// Child Class 1
class Car7 extends Vehicle7 {
    int doors;

    Car7(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    void honk() {
        System.out.println(brand + " car says: Beep Beep!");
    }
}

// Child Class 2
class Bike7 extends Vehicle7 {
    boolean hasGear;

    Bike7(String brand, int year, boolean hasGear) {
        super(brand, year);
        this.hasGear = hasGear;
    }

    void wheelie() {
        System.out.println(brand + " bike is doing a wheelie!");
    }
}

// Main Class to Run the Program
public class OPPExample7 {
    public static void main(String[] args) {

        // Creating Parent Class Object
        Vehicle7 v = new Vehicle7("Generic Vehicle", 2000);
        v.start();
        v.stop();

        System.out.println("---------------------");

        // Creating Child Class Object (Car)
        Car7 c = new Car7("Toyota", 2022, 4);
        c.start();   // from parent
        c.honk();    // from child
        c.stop();    // from parent

        System.out.println("---------------------");

        // Creating Child Class Object (Bike)
        Bike7 b = new Bike7("Yamaha", 2023, true);
        b.start();   // from parent
        b.wheelie(); // from child
        b.stop();    // from parent
    }
}

/*
Generic Vehicle is starting...
Generic Vehicle is stopping...
---------------------
Toyota is starting...
Toyota car says: Beep Beep!
Toyota is stopping...
---------------------
Yamaha is starting...
Yamaha bike is doing a wheelie!
Yamaha is stopping...


 */

/*
Key Points
Parent Class (Vehicle) → Common properties & methods for all vehicles.
Child Classes (Car, Bike) → Inherit parent features and add unique ones.

When to create parent object:
When you only need generic behavior, not specific child features.

When to create child object:
When you need both generic + specific features.

 */