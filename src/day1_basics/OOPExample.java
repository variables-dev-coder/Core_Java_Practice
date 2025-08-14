package day1_basics;


// Parent Class
class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

// Child Class
class Car extends Vehicle {
    int gear;

    // Constructor using super
    Car(String brand, int speed, int gear) {
        super(brand, speed); // Calling parent constructor
        this.gear = gear;
    }

    // Method Overloading
    void displayInfo(String owner) {
        System.out.println(owner + "'s Car -> Brand: " + brand + ", Speed: " + speed + " km/h, Gear: " + gear);
    }
}

public class OOPExample {

    public static void main(String[] args) {
        // Creating object of Car
        Car car1 = new Car("Toyota", 180, 6);

        // Calling parent method
        car1.displayInfo();

        // Calling overloaded method
        car1.displayInfo("Munna");
    }
}

//Brand: Toyota, Speed: 180 km/h
//Munna's Car -> Brand: Toyota, Speed: 180 km/h, Gear: 6

/*
This single program demonstrates:
-Class & Object → Vehicle and Car
-Method → displayInfo()
-Method Overloading → same method name with different parameters
-Constructor → used in both parent & child classes
-this → referring to current object’s gear
-super → calling parent constructor
 */