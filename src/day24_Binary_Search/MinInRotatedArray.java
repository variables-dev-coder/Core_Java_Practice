package day24_Binary_Search;

/*
Problem:
Given a rotated sorted array (no duplicates), find the minimum element in the array.

arr = [4,5,6,7,0,1,2]
Output: 0

arr = [7,8,1,2,3,4,5,6]
Output: 1

Use binary search.
Check which half is sorted:
If left half is sorted, min must be in right half.
If right half is sorted, min must be in left half.

 */

public class MinInRotatedArray {
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                // min is in right half
                low = mid + 1;
            } else {
                // min is in left half including mid
                high = mid;
            }
        }

        // low == high points to minimum
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        int min = findMin(arr);
        System.out.println("Minimum element = " + min);
    }
}

// Minimum element = 0