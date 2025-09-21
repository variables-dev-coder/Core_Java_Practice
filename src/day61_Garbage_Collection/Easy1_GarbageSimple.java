package day61_Garbage_Collection;

public class Easy1_GarbageSimple {
    public static void main(String[] args) {
        String a = new String("hello");
        a = null; // "hello" object eligible for GC
        System.gc(); // suggestion only
        System.out.println("Done");
    }
}

// Done