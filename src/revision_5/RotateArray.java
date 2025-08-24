package revision_5;

import java.util.Arrays;

/*
Rotate Array by K steps (Right Rotation)

Problem: Rotate array elements to the right by k steps.

Example:
Input: [1, 2, 3, 4, 5], k=2
Output: [4, 5, 1, 2, 3]

 */


public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        k = k % n; // handle k > n

        // Reverse helper
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


//Logic: Reverse full array → reverse first k → reverse remaining. (O(n))

//Rotated Array: [4, 5, 1, 2, 3]