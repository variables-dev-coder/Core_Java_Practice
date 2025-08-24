package revision_5;

/*
Remove Duplicates from Sorted Array

Problem: Given a sorted array, remove duplicates in-place & return length of unique elements.

Example:
Input: [1, 1, 2, 2, 3]
Output: [1, 2, 3] (length = 3

 */


import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        int n = arr.length;

        if(n == 0) return;

        int j = 1; // index for unique elements
        for(int i=1; i<n; i++) {
            if(arr[i] != arr[i-1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOfRange(arr, 0, j)));
        System.out.println("Count of unique elements: " + j);
    }
}

//Logic: Use two pointers → one for iteration, one for placing unique elements. (O(n))

//Unique elements: [1, 2, 3]
//Count of unique elements: 3

