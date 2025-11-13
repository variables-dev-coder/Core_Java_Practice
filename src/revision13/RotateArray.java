package revision13;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[start];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// [1, 2, 1, 4, 3, 3, 4]

//Logic:
//Reverse the full array, then reverse parts.
//(Efficient O(n) rotation)
//Concept: Two-pointer logic, array reversal.

