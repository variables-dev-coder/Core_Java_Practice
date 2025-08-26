package day41_Collection_Vector_Legacy_Class;


/*
3. Vector (Legacy Class)
Vector is a class in Java that implements List.
Introduced in Java 1.0 (before Collections Framework).
Later, in Java 2, it was retrofitted to implement List.
Synchronized → thread-safe (all methods are synchronized).
Slower than ArrayList in single-threaded environments.

Key Points:

Default capacity = 10.
Doubles capacity when full.
Legacy class but still useful when multiple threads modify a list.

 */


import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create Vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        // Insert at index
        vector.add(1, "JavaScript");

        // Access element
        System.out.println("First element: " + vector.firstElement());  // First element: Java
        System.out.println("Last element: " + vector.lastElement());   // Last element: C++

        // Remove element
        vector.remove("C++");

        // Iterate
        for(String lang : vector) {
            System.out.println(lang);

            //Java
            //JavaScript
            //Python
        }
    }
}


//When to use Vector?
//Use ArrayList for general purpose (faster, non-thread-safe).
//Use Vector only when you need thread-safety without external synchronization.