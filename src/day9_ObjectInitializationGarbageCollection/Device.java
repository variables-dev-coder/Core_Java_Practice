package day9_ObjectInitializationGarbageCollection;


class Laptop {

    String brand;
    String ram;
    int price;

    // Constructor with parameters
    Laptop(String brand, String ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;

    }

    // Method to display object data
    void displayDetails() {
        System.out.println("Laptop Brand: " + brand + ", Ram: " + ram + ", Price: ₹" + price);
    }
}
public class Device {
    public static void main(String[] args) {
        Laptop lt = new Laptop("Apple", "16GB", 76000);    // Object created with values

        lt.displayDetails();                                                // Output details
    }
}
