package day9_ObjectInitializationGarbageCollection;

public class TestMemory {
    public static void main(String[] args) {

        int localVar = 10;    // Object is stored in Heap
        TestMemory tm = new TestMemory();  // Object is stored in Heap

        System.out.println("Local variable: " + localVar);
        System.out.println("Heap object reference: " +tm);
    }
}
