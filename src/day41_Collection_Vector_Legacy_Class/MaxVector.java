package day41_Collection_Vector_Legacy_Class;

import java.util.Arrays;
import java.util.Vector;

public class MaxVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(10, 25, 8, 30, 15));

        int max = Integer.MIN_VALUE;
        for (int num : v) {
            if(num > max) max = num;
        }
        System.out.println("Max: " + max); // 30
    }
}
