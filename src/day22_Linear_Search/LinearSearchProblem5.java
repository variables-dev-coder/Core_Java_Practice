package day22_Linear_Search;

/*
Question:
Given an unsorted array, find the index of the largest element using Linear Search.

Logic
Assume the first element is the largest.
Loop through the array.
If a larger element is found → update the largest value and its index.
Return the index after the loop.
 */

public class LinearSearchProblem5 {
    public static int findMaxIndex(int[] arr) {
        if (arr.length == 0)
            return -1;       // Edge case: empty array

        int maxIndex = 0;
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 2, 56};

        int maxIndex = findMaxIndex(nums);

        System.out.println("Maximum element index: " + maxIndex);
        System.out.println("Maximum element value: " + nums[maxIndex]);
    }
}
