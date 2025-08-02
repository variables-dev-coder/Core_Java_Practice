package revision_1;

// Inheritance

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving...");
    }
}

class Car extends Vehicle {
    void show() {
        System.out.println("This is a Car");
    }
}
public class Main4 {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();     // Inherited method,  Vehicle is moving...
        c.show();     // Own method,  This is a Car

    }
}
