package day2_OPP;


class Vehicle{
    int speed = 80;

    Vehicle(){
        System.out.println("Vehicle Constructor");
    }

    void showSpeed(){
        System.out.println("Vehicle Speed: " + speed + " km/h");
    }
}

class Bike extends Vehicle{
    int speed = 120;

    Bike(){
        super(); // Call parent constructor
        System.out.println("Bike Constructor");
    }

    void display(){
        super.showSpeed();              // Call parent method
        System.out.println("Bike Speed: " + speed + " km/h");
        System.out.println("Parent Speed using super: " + super.speed);
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.display();
    }
}

// super() → calls parent constructor

// super.speed → accesses parent variable

// super.showSpeed() → calls parent method