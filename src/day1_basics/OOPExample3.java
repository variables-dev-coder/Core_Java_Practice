package day1_basics;


class Vehicle3 {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car3 extends Vehicle3 {
    void openTrunk() {
        System.out.println("Trunk opened.");
    }
}
public class OOPExample3 {
    public static void main(String[] args) {
        Car3 c = new Car3();        // Child object
        c.start();                  // From parent
        c.openTrunk();              // From child
    }
}

/*
Creating Child Class Object
When to do it:
You need both parent features + extra child features.
You want specialized behavior (method overriding).


 */