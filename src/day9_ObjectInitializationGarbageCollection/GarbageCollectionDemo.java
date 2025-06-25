package day9_ObjectInitializationGarbageCollection;


class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println(name + " Object destroyed by GC.");
    }
}
public class GarbageCollectionDemo {
    public static void main(String[] args) {

        Employee e = new Employee("Pooja Paul");
        e = null;

        System.gc();    // Suggest JVM to run GC
        System.out.println("End of Main");

    }
}
