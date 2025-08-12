package day13_Arrays_Strings_DSA_Part2;

/*
1. Impact of String Immutability on String Pool
Question:
Explain how the String pool works in Java and how immutability helps optimize memory usage.
Write a program showing that when two strings have the same literal value, they point to the
same memory location in the string pool.

Key Points Tested:
String pool concept
Memory optimization due to immutability
intern() method

 */


public class StringPoolDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello"; // points to same object in String Pool

        System.out.println(s1 == s2); // true → same reference
        System.out.println(s1.equals(s2)); // true → same content

        // Forcing a new object
        String s3 = new String("Hello");
        System.out.println(s1 == s3); // false → different object
        System.out.println(s1.equals(s3)); // true → same content

        // Using intern() to bring s3 to pool
        String s4 = s3.intern();
        System.out.println(s1 == s4); // true → now pointing to pooled reference
    }
}


//Explanation:
//String literals are stored in the String pool.
//If two literals have the same value, they share the same memory location.
//Immutability ensures no literal in the pool can be changed, making sharing safe.
//intern() ensures that a string refers to a pool object.

