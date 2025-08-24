package revision_5;


/*
Search in Rotated Sorted Array

Problem: Given a rotated sorted array, find target element.

Example:
Input: arr = [4,5,6,7,0,1,2], target = 0
Output: Found at index 4
 */


public class RotatedSortedSearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int index = search(arr, target);

        if(index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }

    static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) return mid;

            // Left half sorted
            if(arr[low] <= arr[mid]) {
                if(target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half sorted
            else {
                if(target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}


//Element found at index 4

/*
Logic:
At each step, one half is sorted.
Check if target lies in sorted half → move accordingly.
Time Complexity: O(log n)
 */