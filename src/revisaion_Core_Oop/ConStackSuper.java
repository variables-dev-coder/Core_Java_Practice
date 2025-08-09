package revisaion_Core_Oop;


/*
3. Constructors, this, and super
Theory
Constructor: Special method to initialize objects; same name as class, no return type.
Types:
Default constructor (no parameters)
Parameterized constructor
this: Refers to the current object.
super: Refers to the parent class object.
 */


class Vehicle2 {
    Vehicle2() {
        System.out.println("Vehicle constructor");
    }
}

class Car2 extends Vehicle2 {
    String model;

    Car2(String model) {
        super(); // calls parent constructor
        this.model = model; // refers to current object variable
        System.out.println("Car constructor: " + model);
    }
}

public class ConStackSuper {

    public static void main(String[] args) {
        Car2 car1 = new Car2("Tesla");
    }

}

// Vehicle constructor
//Car constructor: Tesla