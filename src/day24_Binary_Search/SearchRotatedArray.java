package day24_Binary_Search;

/*
Problem:
A rotated sorted array is a sorted array that has been rotated at some pivot. Find the index of a target element.

arr = [4,5,6,7,0,1,2]
target = 0
Output: 4

arr = [4,5,6,7,0,1,2]
target = 3
Output: -1 // not found

The array is rotated, so normal binary search won't work.
Check which half is sorted:
If left half is sorted and target is in left → search left
Else search right
Repeat until found

 */


public class SearchRotatedArray {
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            // Left half sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1; // target in left half
                } else {
                    low = mid + 1;  // target in right half
                }
            }
            // Right half sorted
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;  // target in right half
                } else {
                    high = mid - 1; // target in left half
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        int index = search(arr, target);
        System.out.println("Index of " + target + " = " + index);
    }
}

// Index of 0 = 4