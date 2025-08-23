package revision_4;

public class StringTypesDemo {
    public static void main(String[] args) {
        // ---------- String (Immutable) ----------
        String s1 = "Hello";
        System.out.println("Original String: " + s1);

        s1.concat(" World"); // creates a new object, not assigned
        System.out.println("After concat (no change): " + s1);

        s1 = s1.concat(" World"); // now new object reference stored
        System.out.println("After concat (with assignment): " + s1);

        // ---------- StringBuilder (Mutable, Not Thread-Safe) ----------
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("\nOriginal StringBuilder: " + sb);

        sb.append(" World"); // modifies same object
        System.out.println("After append: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        // ---------- StringBuffer (Mutable, Thread-Safe) ----------
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("\nOriginal StringBuffer: " + sbf);

        sbf.append(" World");
        System.out.println("After append: " + sbf);

        sbf.insert(5, " Java");
        System.out.println("After insert: " + sbf);
    }
}


/*
o/p

Original String: Hello
After concat (no change): Hello
After concat (with assignment): Hello World

Original StringBuilder: Hello
After append: Hello World
After reverse: dlroW olleH

Original StringBuffer: Hello
After append: Hello World
After insert: Hello Java World



1. Immutable String (String class)
String objects are immutable → once created, they cannot be changed.
Any modification (concat, replace, etc.) creates a new object in the String pool/heap.
Thread-safe because of immutability.
But less efficient in heavy modifications (like loops).

2. Mutable String (StringBuilder & StringBuffer)
StringBuilder and StringBuffer are mutable → we can change the contents without creating new objects.
StringBuilder: Not synchronized → faster, not thread-safe.
StringBuffer: Synchronized → thread-safe, but slower.


uick Comparison Table

| Feature     | String (Immutable)            | StringBuilder (Mutable)                  | StringBuffer (Mutable, Thread-safe)     |
| ----------- | ----------------------------- | ---------------------------------------- | --------------------------------------- |
| Mutability  | ❌ Immutable                   | ✅ Mutable                                | ✅ Mutable                               |
| Thread-Safe | ✅ Yes (due to immutability)   | ❌ No                                     | ✅ Yes (synchronized)                    |
| Performance | Slow in modifications         | Fast                                     | Slower than Builder                     |
| Use Case    | Few changes, constant strings | Many modifications, single-threaded apps | Many modifications, multi-threaded apps |




 */