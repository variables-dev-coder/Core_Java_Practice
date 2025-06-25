package day9_ObjectInitializationGarbageCollection;


class Dog {
    String breed;

    Dog(String breed) {
        this.breed = breed;

    }

    @Override
    protected void finalize() {
        System.out.println("Dog object (" + breed + ") destroyed.");
    }
}
public class GCDemo2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Labrador");
        Dog d2 = new Dog("Pomeranian");

        d1 = d2; // Labrador object becomes unreachable (eligible for GC)

        System.gc();
    }
}
