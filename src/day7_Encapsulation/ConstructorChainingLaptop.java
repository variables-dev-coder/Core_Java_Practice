package day7_Encapsulation;


class Laptop {
    String brand;
    int ram;
    double price;

    // Constructor all fields
    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    // Constructor with brand  and ram (calls 3 param constructor)
    Laptop(String brand, int ram) {
        this(brand, ram, 45000.0);  // constructor chaining
    }

    // Default constructor
    Laptop() {
        this("Unknown", 4);
    }

    void display(){
        System.out.println(" Brand: " + brand + ", Ram: " + ram + ", Price: " + price);
    }
}
public class ConstructorChainingLaptop {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("HP", 16);
        Laptop l3 = new Laptop("Dell", 16, 89000);

        l1.display();
        l2.display();
        l3.display();
    }
}
