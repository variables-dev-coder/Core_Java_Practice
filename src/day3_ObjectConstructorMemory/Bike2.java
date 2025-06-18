package day3_ObjectConstructorMemory;

public class Bike2 {
    Engine2 engine = new Engine2();   // HAS-A relationship

    void ride(){
        engine.start();  // Calling method of Engine
        System.out.println("Bike2 is running...");
    }

    public static void main(String[] args) {

        Bike2 bike = new Bike2();
        bike.ride();
    }
}
