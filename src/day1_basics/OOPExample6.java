package day1_basics;


// Parent class
class Vehicle7 {
    String brand;
    int year;

    // Constructor
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

// Child class
class Car7 extends Vehicle7 {
    int doors;

    // Constructor for child class
    Car7(String brand, int year, int doors) {
        super(brand, year); // calling parent constructor
        this.doors = doors;
    }

    void honk() {
        System.out.println(brand + " says Beep Beep!");
    }
}

// Main class to run the program
public class OOPExample6 {
    public static void main(String[] args) {

        // Creating parent class object
        Vehicle7 vehicle = new Vehicle7("Generic Vehicle", 2020);
        vehicle.start();
        vehicle.stop();

        System.out.println();

        // Creating child class object
        Car7 car = new Car7("Toyota", 2024, 4);
        car.start();   // inherited method
        car.honk();    // child method
        car.stop();    // inherited method
    }
}

/*
Generic Vehicle is starting...
Generic Vehicle is stopping...

Toyota is starting...
Toyota says Beep Beep!
Toyota is stopping...

 */