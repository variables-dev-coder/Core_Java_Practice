package revision;



// Abstract class
abstract class Vehicle2 {
    // Abstract method (no body)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Interface
interface MusicSystem {
    void playMusic();
}

// Child class implementing both
class Car2 extends Vehicle2 implements MusicSystem {

    @Override
    void start() {
        System.out.println("Car starts with a key ignition.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music in the car.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle2 myCar = new Car2(); // Using abstract class reference
        myCar.start();  // Calls overridden method in Car
        myCar.stop();   // Calls concrete method from Vehicle

        // Interface reference
        MusicSystem musicCar = new Car2();
        musicCar.playMusic();
    }
}

/*
Car starts with a key ignition.
Vehicle stopped.
Playing music in the car.
 */