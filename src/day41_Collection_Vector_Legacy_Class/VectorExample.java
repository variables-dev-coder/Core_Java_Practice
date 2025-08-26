package day41_Collection_Vector_Legacy_Class;


/*
Q1: What is a Vector in Java? How is it different from ArrayList?

Answer:
Vector is a legacy class in java.util package (introduced in JDK 1.0).
It implements List, RandomAccess, Cloneable, Serializable.
Vector is synchronized → Thread-safe, but slower than ArrayList in single-threaded cases.
Default capacity: 10, doubles when full (ArrayList increases by 50%).
 */


import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();    // default capacity 10
        Vector<String> v2 = new Vector<>(20);    // custom capacity
        Vector<Double> v3 = new Vector<>(5, 2);   // capacity = 5, increment = 2

        v1.add(10);
        v1.add(15);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        v1.add(60);
        v1.add(70);
        v1.add(80);
        v1.add(90);
        v1.add(100);


        System.out.println(v1); // [10, 20]
    }
}
