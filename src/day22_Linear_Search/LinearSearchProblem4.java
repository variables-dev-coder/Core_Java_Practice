package day22_Linear_Search;


/*
Problem 4: Find the Index of the Minimum Element in an Unsorted Array
Question:
Given an unsorted array, find the index of the smallest element using Linear Search.

Logic
Assume the first element is the smallest.
Loop through the array.
If a smaller element is found → update the smallest value and its index.
Return the index after the loop.
 */

public class LinearSearchProblem4 {
    public static int findMinIndex(int[] arr) {
        if (arr.length == 0)
            return -1;

        int minIndex = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 89, 3, 56, 67};

        int minIndex = findMinIndex(nums);

        System.out.println("Minimum element index: " + minIndex);
        System.out.println("Minimum element value: " + nums[minIndex]);
    }
}
