package day12_Arrays_Strings_DSA;

public class ReverseArrayManualLogic_3 {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};

        System.out.print("Original Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        // Reverse logic using two pointers
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.print("\nReverse Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
