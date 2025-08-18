package day24_Binary_Search;

/*
Given a sorted array, find the largest element smaller than or equal to a target.
If all elements are greater, return -1.

arr = [1, 3, 5, 7, 9]
target = 6
Output: 5  // largest element <= 6

arr = [1, 3, 5, 7, 9]
target = 0
Output: -1 // no element <= 0

Use modified binary search.
If arr[mid] <= target, move right to find a larger eligible element.
Keep track of result.

 */


public class FloorElement {
    public static int floor(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                result = arr[mid];   // possible floor
                low = mid + 1;       // try right for larger floor
            } else {
                high = mid - 1;      // move left
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 6;

        int flr = floor(arr, target);
        System.out.println("Floor of " + target + " = " + flr);
    }
}

// Floor of 6 = 5