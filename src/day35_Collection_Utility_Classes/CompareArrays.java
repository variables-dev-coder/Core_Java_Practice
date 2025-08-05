package day35_Collection_Utility_Classes;

// Compare Two Arrays

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        boolean isEqual = Arrays.equals(a, b);
        System.out.println("Arrays equal: " + isEqual);
    }
}
