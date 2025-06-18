package day3_ObjectConstructorMemory;

public class Laptop {

    String brand;
    int price;

    // Default Constructor
    Laptop(){
        brand = "Acer";
        price = 60000;
    }

    // Parametrized Constructor
    Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    void display(){
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("hp", 58000);

        l1.display();
        l2.display();

    }
}
