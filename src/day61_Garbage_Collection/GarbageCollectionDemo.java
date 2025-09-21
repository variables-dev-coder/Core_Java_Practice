package day61_Garbage_Collection;

public class GarbageCollectionDemo {

    public static void main(String[] args) {
        // Object eligible for GC after null assignment
        String str = new String("Hello");
        str = null;

        // Object eligible for GC after reassignment
        Object obj1 = new Object();
        Object obj2 = new Object();
        obj1 = obj2;

        // Anonymous object (no reference) → immediate GC eligible
        new GarbageCollectionDemo();

        // Suggest JVM to run GC
        System.gc();
        Runtime.getRuntime().gc();
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called before GC!");
    }
}

// Finalize method called before GC!