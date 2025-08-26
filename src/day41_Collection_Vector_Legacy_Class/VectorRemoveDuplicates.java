package day41_Collection_Vector_Legacy_Class;

/*
Remove duplicates from a Vector

Concept: Use LinkedHashSet to maintain order while removing duplicates.
 */


import java.util.*;

public class VectorRemoveDuplicates {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(Arrays.asList(10, 20, 20, 30, 40, 30, 50));

        LinkedHashSet<Integer> set = new LinkedHashSet<>(vector);
        vector.clear();
        vector.addAll(set);

        System.out.println("After removing duplicates: " + vector);
    }
}
