package day12_Arrays_Strings_DSA;

// Given an array, find the smallest (minimum) number among all the elements.

public class MinInArray_3 {
    public static void main(String[] args) {
        int[] arr = {101, 34, 88, 3, 999, 43};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Number is: " + min);
    }
}
