package day24_Binary_Search;

/*
Given a sorted array, find the smallest element greater than or equal to a target.
If all elements are smaller, return -1.

Use modified binary search.
If arr[mid] >= target, move left to find smaller eligible element.
Keep track of result.

arr = [1, 3, 5, 7, 9]
target = 4
Output: 5  // smallest element >= 4


arr = [1, 3, 5, 7, 9]
target = 10
Output: -1 // no element >= 10


 */
public class CeilingElement {
    public static int ceiling(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                result = arr[mid];   // possible ceiling
                high = mid - 1;      // try left for smaller ceiling
            } else {
                low = mid + 1;       // move right
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 4;

        int ceil = ceiling(arr, target);
        System.out.println("Ceiling of " + target + " = " + ceil);
    }
}

// Ceiling of 4 = 5