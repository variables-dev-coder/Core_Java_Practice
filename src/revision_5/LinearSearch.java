package revision_5;

/*
Linear Search

Problem: Find a target element in an array using linear search.

Example:
Input: arr = [5, 8, 2, 9, 1], target = 9
Output: Found at index 3
 */


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 9, 1};
        int target = 9;
        int index = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }

        if(index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}


//Element found at index 3


//Logic: Check each element one by one until found.
//Time Complexity: O(n)

