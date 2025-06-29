package day12_Arrays_Strings_DSA;


// Given an array, find the largest (maximum) number among all the elements.

public class MaxInArray_4 {
    public static void main(String[] args) {
        int[] arr = {101, 34, 88, 999, 43};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Number is: " + max);
    }
}
