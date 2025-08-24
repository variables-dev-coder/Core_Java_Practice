package revision_5;

/*
Reverse an Array

Problem: Reverse elements of an array.

Example:
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]

 */


import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int start = 0, end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

//Logic: Swap first & last, move inward until start < end. (O(n))

//Reversed Array: [5, 4, 3, 2, 1]