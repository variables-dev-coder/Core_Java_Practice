package day3_ObjectConstructorMemory;

public class Car {
    Car(){
        System.out.println("Car is created");
    }

    public static void main(String[] args) {
        Car c = new Car(); // Constructor called
    }
}
