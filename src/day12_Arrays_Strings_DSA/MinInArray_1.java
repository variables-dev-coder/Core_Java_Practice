package day12_Arrays_Strings_DSA;


// Given an array, find the smallest (minimum) number among all the elements.

public class MinInArray_1 {
    public static void main(String[] args) {
        int[] arr = {15, 80, 42, 90, 5};
        int min = arr[0];           // assume first element is min

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];       // update min if current element is smaller
            }
        }
        System.out.println("Minimum Number is: " + min);
    }
}
