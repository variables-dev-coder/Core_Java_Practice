package revision;


// Parent class
class Vehicle {
    String brand = "Generic Vehicle";

    void start() {
        System.out.println(brand + " is starting...");
    }
}

// Child class
class Car extends Vehicle {
    String model = "Sedan";

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();       // Inherited method from Vehicle
        myCar.displayInfo(); // Method from Car
    }
}

/*
Generic Vehicle is starting...
Brand: Generic Vehicle
Model: Sedan
 */