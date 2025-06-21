package day6_Abstraction;


interface Engine {
    void start();
    void stop();
}

abstract class Vehicle implements Engine {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract double getRentalPricePerDay();

    void showInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    public void start() {
        System.out.println("Car engine started");
    }

    public void stop() {
        System.out.println("Car engine stopped");
    }

    double getRentalPricePerDay() {
        return 2000.0;
    }
}

class Bike extends Vehicle {

    Bike(String brand){
        super(brand);
    }

    public void start() {
        System.out.println("Bike engine started");
    }

    public void stop() {
        System.out.println("Bike engine stopped");
    }

    double getRentalPricePerDay(){
        return 1000.0;
    }
}
public class RentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("Hyundai");
        car.showInfo();
        car.start();
        System.out.println("Rental/day: ₹" + car.getRentalPricePerDay());
        car.stop();

        System.out.println("------------------");

        Vehicle bike = new Bike("Yamaha");
        bike.showInfo();
        bike.start();
        System.out.println("Rental/day: ₹" + bike.getRentalPricePerDay());
        bike.stop();
    }
}
