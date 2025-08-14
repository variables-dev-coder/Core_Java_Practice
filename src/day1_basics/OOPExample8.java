package day1_basics;


// Parent class
class Vehicle8 {
    String brand;

    Vehicle8(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting...");
    }
}

// Child class 1
class Car8 extends Vehicle8 {
    int doors;

    Car8(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    void honk() {
        System.out.println(brand + " is honking!");
    }
}

// Child class 2
class ElectricCar8 extends Car8 {
    int batteryCapacity;

    ElectricCar8(String brand, int doors, int batteryCapacity) {
        super(brand, doors);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(brand + " is charging with " + batteryCapacity + " kWh battery.");
    }
}

// Main class

public class OOPExample8 {
    public static void main(String[] args) {
        // Parent class object
        Vehicle8 v = new Vehicle8("Generic Vehicle");
        v.start();
        // v.honk();  Not accessible because v is a Vehicle type

        System.out.println();

        // Child class object (Car)
        Car8 c = new Car8("Toyota", 4);
        c.start(); // Inherited from Vehicle
        c.honk();  // Car's own method

        System.out.println();

        // Grandchild class object (ElectricCar)
        ElectricCar8 e = new ElectricCar8("Tesla", 4, 75);
        e.start();  // From Vehicle
        e.honk();   // From Car
        e.charge(); // From ElectricCar
    }
}


/*
Generic Vehicle is starting...

Toyota is starting...
Toyota is honking!

Tesla is starting...
Tesla is honking!
Tesla is charging with 75 kWh battery.



Key Difference
Parent class object → Can only access parent’s properties/methods.
Child class object → Can access both parent and its own properties/methods.
ElectricCar → Can access everything from Vehicle, Car, and itself.
 */