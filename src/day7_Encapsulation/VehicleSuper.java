package day7_Encapsulation;


class Vehicle {
    String brand;
    double price;


    Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Parent Constructor called...");
    }

    void showVehicle () {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

}

class Bike extends Vehicle {
    int topSpeed;

    Bike(String brand, double price, int topSpeed) {
        super(brand, price); // Call Vehicle Constructor
        this.topSpeed = topSpeed;
        System.out.println("Bike Constructor called...");
    }

    void showBike(){
        showVehicle();
        System.out.println("Top Speed: " + topSpeed);
    }
}
public class VehicleSuper {
    public static void main(String[] args) {

        Bike b1 = new Bike("Royal Enfield", 280000, 220);

        b1.showBike();
    }
}
