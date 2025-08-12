package day13_Arrays_Strings_DSA_Part2;

public class StringImmutableDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1; // Both refer to same object in String pool

        // Modifying s1
        s1 = s1 + " World"; // New object is created

        System.out.println(s1); // Output: Hello World
        System.out.println(s2); // Output: Hello
        System.out.println(s1 == s2); // false - Different objects
    }
}

//Hello World
//Hello
//false

/*

Why String is Immutable in Java?

Explanation:
In Java, a String is immutable, meaning once created, its value cannot be changed.
If you try to modify it, a new String object is created instead of changing the original.

Reasons:
1. String Pool Optimization
    - Strings are stored in the String Constant Pool to save memory. If they were mutable,
      changing one reference would unintentionally change all others pointing to the same object.

2. Security
    - Strings are widely used in sensitive areas (e.g., file paths, network URLs,
      database credentials). Immutability prevents malicious code from altering them after creation.

3. Thread-Safety
     - Since strings cannot be changed, they are inherently thread-safe — multiple threads
       can share them without synchronization

 */