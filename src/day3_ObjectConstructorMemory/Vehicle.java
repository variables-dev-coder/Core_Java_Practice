package day3_ObjectConstructorMemory;


class Engine{
    void start(){
        System.out.println("Engine started...");
    }
}

class Car2{
    Engine engine = new Engine();  // HAS - A relation

    void move(){
        engine.start();   // Car uses Engine
        System.out.println("Car is moving...");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.move();
    }
}
