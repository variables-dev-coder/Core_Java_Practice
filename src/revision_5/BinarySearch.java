package revision_5;

/*
Binary Search (Sorted Array)

Problem: Search for a target element in a sorted array.

Example:
Input: arr = [2, 4, 6, 8, 10], target = 6
Output: Found at index 2
 */


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        int low = 0, high = arr.length - 1;
        int index = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                index = mid;
                break;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if(index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}

//Element found at index 2

//Logic: Divide array in half each step → check mid → move left/right.
//Time Complexity: O(log n)