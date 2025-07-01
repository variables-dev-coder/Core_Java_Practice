package day12_Arrays_Strings_DSA;

public class ReverseArrayManualLogic_2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Original Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        // Reverse logic using two pointers
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap
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
