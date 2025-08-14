package day1_basics;


class Vehicle4 {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car4 extends Vehicle4 {
    @Override
    void start() {
        System.out.println("Car starting with push button...");
    }
}
public class OOPExample4 {
    public static void main(String[] args) {
        Vehicle4 v = new Car4(); // Parent ref, Child object
        v.start(); // Calls Car's overridden method
        // v.openTrunk(); // Not accessible (reference type limits access)
    }
}
