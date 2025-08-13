package day22_Linear_Search;


//Question:
//Given an integer array and a number x, find the index of the first element greater
// than x using Linear Search. If no such element exists, return -1.

//Logic
//Loop through the array.
//If arr[i] > x → return i.
//If loop ends → return -1.


public class LinearSearchBonus2 {

    public static int firstGreaterThan(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                return i;
            }
        }
        return -1; // No element greater than x
    }

    public static void main(String[] args) {
        int[] nums = {5, 8, 12, 3, 18, 7};
        int x = 10;

        int index = firstGreaterThan(nums, x);

        if (index != -1) {
            System.out.println("First element greater than " + x + " found at index: " + index);
        } else {
            System.out.println("No element greater than " + x);
        }
    }
}
