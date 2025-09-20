package day60_Java_Memory_Model;

// Primitive vs Reference Storage

public class MemoryTest1 {
    public static void main(String[] args) {
        int a = 10; // primitive in Stack
        int b = a;  // copy in Stack
        b = 20;

        System.out.println("a = " + a); // ?
        System.out.println("b = " + b); // ?
    }
}

// Shows copy behavior for primitives.

// a = 10
// b = 20

