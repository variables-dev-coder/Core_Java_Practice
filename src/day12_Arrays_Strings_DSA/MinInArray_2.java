package day12_Arrays_Strings_DSA;

// Given an array, find the smallest (minimum) number among all the elements.

public class MinInArray_2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8,1, 45, 67};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Number is: " + min);
    }
}
