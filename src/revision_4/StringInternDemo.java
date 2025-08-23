package revision_4;

public class StringInternDemo {
    public static void main(String[] args) {
        String s1 = "hello";              // goes to SCP
        String s2 = new String("hello");  // stored in heap
        String s3 = s2.intern();          // refers to SCP

        System.out.println(s1 == s2); // false (heap vs SCP)
        System.out.println(s1 == s3); // true (both in SCP)
    }
}

/*
1. String Interning – intern() method

Concept:
Java maintains a String Constant Pool (SCP) in the heap.
When you create a string literal ("hello"), JVM checks SCP. If the value exists,
it returns the reference; else, it adds it.
intern() ensures that the string object refers to the SCP version instead of heap duplicates.

Use case: Saves memory by reusing immutable string literals. Best in cases with repeated values.
 */