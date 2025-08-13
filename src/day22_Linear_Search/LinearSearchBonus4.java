package day22_Linear_Search;


/*

Question:
Given an integer array, find the index of the first even number using Linear Search.
If no even number exists, return -1.

Logic
Loop through the array.
Check if arr[i] % 2 == 0.
If true → return index.
If loop ends → return -1.
 */


public class LinearSearchBonus4 {
    public static int firstEvenNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                return i;
            }
        }
        return -1; // No even number found
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 11, 8, 15, 20};

        int index = firstEvenNumber(nums);

        if (index != -1) {
            System.out.println("First even number found at index: " + index + " ( Value: " + nums[index] + ")");
        } else {
            System.out.println("No Even number Found");
        }
    }
}
