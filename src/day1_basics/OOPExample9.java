package day1_basics;



// Parent Class
class Vehicle9 {
    String brand;

    Vehicle9(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting...");
    }

    void stop() {
        System.out.println(brand + " is stopping...");
    }
}

// Child Class 1
class Car9 extends Vehicle9 {
    int doors;

    Car9(String brand, int doors) {
        super(brand); // calling parent constructor
        this.doors = doors;
    }

    void honk() {
        System.out.println(brand + " is honking...");
    }
}

// Child Class 2
class Bike9 extends Vehicle9 {
    boolean hasKickStart;

    Bike9(String brand, boolean hasKickStart) {
        super(brand);
        this.hasKickStart = hasKickStart;
    }

    void wheelie() {
        System.out.println(brand + " is doing a wheelie!");
    }
}

// Main Class

public class OOPExample9 {
    public static void main(String[] args) {

        // Parent class object
        Vehicle9 v1 = new Vehicle9("Generic Vehicle");
        v1.start();
        v1.stop();

        System.out.println();

        // Child class Car object
        Car9 c1 = new Car9("Toyota", 4);
        c1.start();   // inherited method
        c1.honk();    // child specific method
        c1.stop();

        System.out.println();

        // Child class Bike object
        Bike9 b1 = new Bike9("Yamaha", true);
        b1.start();
        b1.wheelie();
        b1.stop();
    }

}

/*
Generic Vehicle is starting...
Generic Vehicle is stopping...

Toyota is starting...
Toyota is honking...
Toyota is stopping...

Yamaha is starting...
Yamaha is doing a wheelie!
Yamaha is stopping...

Parent class object is used when you just need generic vehicle behavior.
Child class object is used when you want extra functionality (Car’s honk, Bike’s wheelie).
Inheritance + super keyword for constructor chaining.

 */