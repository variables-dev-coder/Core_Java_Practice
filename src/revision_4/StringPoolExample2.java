package revision_4;

public class StringPoolExample2 {
    public static void main(String[] args) {
        String s1 = "hello";     // stored in String pool
        String s2 = "hello";     // refers to same object from pool

        String s3 = new String("hello"); // stored in heap (new object)

        System.out.println(s1 == s2); // true (same pool reference)
        System.out.println(s1 == s3); // false (different objects)
        System.out.println(s1.equals(s3)); // true (content is same)
    }
}

/*
1. What is String Pool?

String Pool (also called String Intern Pool) is a special memory
region inside the heap where unique string literals are stored.

If a new string literal is created and it already exists in the pool,
Java reuses the reference instead of creating a new object.

2. What is Heap Memory?

Normal objects (created using new) are stored in heap memory, outside the string pool.
Even if two strings have the same content, if they are created with new, they are different objects in heap.


Key Points

String literals go to pool.
new String("...") always creates a new object in heap.
== compares references (addresses).
.equals() compares content.
intern() method can move a heap string into pool.



 */