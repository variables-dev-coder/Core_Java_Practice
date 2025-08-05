package day35_Collection_Utility_Classes;


//  Fill Array with a Specific Value

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr, 7);
        System.out.println("Filled Array: " + Arrays.toString(arr));
    }
}
