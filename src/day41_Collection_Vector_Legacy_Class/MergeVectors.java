package day41_Collection_Vector_Legacy_Class;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class MergeVectors {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(Arrays.asList(5, 1, 3));
        Vector<Integer> v2 = new Vector<>(Arrays.asList(4, 2, 6));

        v1.addAll(v2);
        Collections.sort(v1);

        System.out.println(v1); // [1, 2, 3, 4, 5, 6]
    }
}
