package day9_ObjectInitializationGarbageCollection;


class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    protected void finalize() {
        System.out.println("Car object destroyed: " + model);
    }
}
public class GarbageCollection {
    public static void main(String[] args) {

        Car c1 = new Car("BMW");
        c1 = null;    // eligible GC (not guaranteed)
        System.out.println("Main method ends");
    }
}
