package day41_Collection_Vector_Legacy_Class;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorFrequency {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));

        System.out.println("Frequency of apple: " + Collections.frequency(vector, "apple"));
        System.out.println("Frequency of banana: " + Collections.frequency(vector, "banana"));
    }
}


//Find the frequency of elements in a Vector
//Concept: Use Collections.frequency.


//Frequency of apple: 2
//Frequency of banana: 2