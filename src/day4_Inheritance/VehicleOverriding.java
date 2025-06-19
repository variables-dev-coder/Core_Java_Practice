package day4_Inheritance;


class Vehicle3 {
    String type;

    Vehicle3(String type){
        this.type = type;
        System.out.println("Vehicle3 constructor Called");
    }

    void display(){
        System.out.println("Vehicle3 Type: " + type);
    }
}

class Bike extends Vehicle3 {
    String brand;

    Bike(String type, String brand){
        super(type);
        this.brand = brand;
        System.out.println("Bike constructor class");
    }

    void display(){
        super.display();
        System.out.println("Bike Brand: " + brand);
    }
}

class Car3 extends Vehicle3 {
    int seatCount;

    Car3(String type, int seatCount){
        super(type);
        this.seatCount = seatCount;
        System.out.println("Car3 constructor called ");
    }

    void display(){
        super.display();
        System.out.println("Car3 Total Seat: " + seatCount);
    }
}

public class VehicleOverriding {
    public static void main(String[] args) {
        System.out.println("------Bike--------");
        Bike b1 = new Bike("Two wheeler", "Ducati");
        b1.display();

        System.out.println("\n---------Car-----------");
        Car3 c = new Car3("Four Wheeler", 4);
        c.display();
    }
}
