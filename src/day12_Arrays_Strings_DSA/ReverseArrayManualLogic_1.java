package day12_Arrays_Strings_DSA;

// Reverse the elements of an array without using built-in functions.

public class ReverseArrayManualLogic_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Original Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        // Reverse logic using two pointers
        int start = 0;
        int end = arr.length -1;

        while ( start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("\nReversed Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
