package day22_Linear_Search;


/*
Question:
Given an array, find the last index where the target element appears using Linear Search.
If the target does not exist, return -1.

Logic
Initialize lastIndex = -1.
Loop through the array.
If an element matches the target → update lastIndex.
After the loop, return lastIndex.

 */

public class LinearSearchBonus3 {
    public static int lastOccurrence(int[] arr, int target) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 20, 40, 20, 50, 60};
        int target = 20;

        int index = lastOccurrence(nums, target);

        if (index != -1) {
            System.out.println("Last Occurence of " + target + " found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
