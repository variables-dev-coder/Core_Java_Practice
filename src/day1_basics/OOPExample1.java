package day1_basics;


// Vehicle.java
class Vehicle1 {
    String brand;
    int year;

    // Constructor
    Vehicle1(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class OOPExample1 {
    public static void main(String[] args) {
        // Creating an object of Vehicle
        Vehicle1 car = new Vehicle1("Toyota", 2022);

        // Calling method
        car.displayInfo();
    }
}

// Brand: Toyota, Year: 2022

/*
Key points to remember before creating an object:
-If the class is abstract, you cannot directly create an object.
-If it has a private constructor, you also can’t create it outside that class.
-Otherwise, use the new keyword to create the object.
 */