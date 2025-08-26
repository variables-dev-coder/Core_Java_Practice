package day41_Collection_Vector_Legacy_Class;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorReverse {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Before reverse: " + vector);

        Collections.reverse(vector);
        System.out.println("After reverse: " + vector);
    }
}

//[5, 4, 3, 2, 1]


//Reverse elements in a Vector
//Concept: Reverse without creating another collection.
//Solution: Use Collections.reverse().