package day41_Collection_Vector_Legacy_Class;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(1,2, 2, 2, 3, 3, 4, 5));

        Set<Integer> set = new LinkedHashSet<>(v);
        v.clear();
        v.addAll(set);

        System.out.println(v);  // [1, 2, 3, 4, 5]
    }
}
