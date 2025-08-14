package day1_basics;


// Parent class
class Vehicle10 {
    String brand;

    // Constructor
    Vehicle10(String brand) {
        this.brand = brand;
    }

    // Method
    void startEngine() {
        System.out.println(brand + " engine started.");
    }
}

// Child class 1
class Car10 extends Vehicle10 {
    int doors;

    Car10(String brand, int doors) {
        super(brand); // Call parent constructor
        this.doors = doors;
    }

    void displayCarInfo() {
        System.out.println("Car Brand: " + brand + ", Doors: " + doors);
    }
}

// Child class 2
class Bike10 extends Vehicle10 {
    boolean hasGear;

    Bike10(String brand, boolean hasGear) {
        super(brand);
        this.hasGear = hasGear;
    }

    void displayBikeInfo() {
        System.out.println("Bike Brand: " + brand + ", Has Gear: " + hasGear);
    }
}

// Main class to test
public class OOPExample10 {
    public static void main(String[] args) {
        // Parent class object
        Vehicle10 v1 = new Vehicle10("Generic Vehicle");
        v1.startEngine();

        // Child class Car object
        Car10 c1 = new Car10("Toyota", 4);
        c1.startEngine(); // Inherited method
        c1.displayCarInfo();

        // Child class Bike object
        Bike10 b1 = new Bike10("Yamaha", true);
        b1.startEngine(); // Inherited method
        b1.displayBikeInfo();
    }
}

/*
Generic Vehicle engine started.
Toyota engine started.
Car Brand: Toyota, Doors: 4
Yamaha engine started.
Bike Brand: Yamaha, Has Gear: true


When to create a parent object → When you only need generic features (Vehicle v1).
When to create a child object → When you need specific features (Car c1 or Bike b1).
 */