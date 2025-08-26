package day41_Collection_Vector_Legacy_Class;


/*
How does capacity differ from size in Vector?

Answer:

Size: Number of elements currently in the Vector.
Capacity: Maximum elements it can hold before resizing.

 */


import java.util.Vector;

public class VectorSize {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3);

        v.add(1);
        v.add(2);
        v.add(3);
       // v.add(4);  // After resizing capacity will be 6


        System.out.println(v.size());  // 4
        System.out.println(v.capacity());  // 3, not resize if add one more element it will be resize double
    }
}
