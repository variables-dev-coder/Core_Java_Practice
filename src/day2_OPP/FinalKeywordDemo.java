package day2_OPP;

final class Vehicle2{
    final int speedLimit = 100;

    final void show(){
        System.out.println("Max speed: " + speedLimit);
    }
}

// X Below line would give error if uncommented because Vehicle2 is final
// class Car extends Vehicle2 { ... }

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Vehicle2 v2 = new Vehicle2();
        v2.show();

        // X The line below gives error because speedLimit is final
        // v.speedLimit = 120;
    }
}

/*

Summary:
Use final to define constants like PI, MAX_LIMIT, etc.

Prevents method override in subclasses.

Prevents class inheritance to ensure design security.

 */