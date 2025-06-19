package day4_Inheritance;

class Vehicle{
    void move(){
        System.out.println("Vehicle is Moving...");
    }
}

class Car extends Vehicle{
    void Brake(){
        System.out.println("Car has Brake...");
    }
}

class ElectricCar extends Car{
    void charge(){
        System.out.println("Electric Car is Charging...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar();

        tesla.move();  // from vehicle
        tesla.Brake();  // from car
        tesla.charge();  // from ElectricCar

    }
}
