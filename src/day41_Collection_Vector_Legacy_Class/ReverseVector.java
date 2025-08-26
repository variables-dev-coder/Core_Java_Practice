package day41_Collection_Vector_Legacy_Class;

import java.util.Arrays;
import java.util.Vector;

public class ReverseVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));

        int left = 0;
        int right = v.size() - 1;

        while (left < right) {
            int temp = v.get(left);
            v.set(left, v.get(right));
            v.set(right, temp);
            left++;
            right--;
        }
        System.out.println(v);
    }
}


// [5,4,3,2,1]