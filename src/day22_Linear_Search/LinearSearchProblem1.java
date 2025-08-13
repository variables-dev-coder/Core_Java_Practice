package day22_Linear_Search;

public class LinearSearchProblem1 {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;    // Element found
            }
        }
        return -1;  // Not found
    }

    public static void main(String[] args) {
        int[] nums = { 11, 23, 45, 67, 90, 10};
        int target = 45;

        int index = linearSearch(nums, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}


/*
Question:
Write a program to search for a given number in an integer array using linear search.
If found, return the index, else return -1.

Logic
Start at index 0.

Compare each element with the target.
If equal → return index.
If loop ends → return -1.
 */