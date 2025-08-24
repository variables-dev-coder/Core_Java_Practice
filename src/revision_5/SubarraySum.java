package revision_5;

/*
Subarray Sum (Brute Force)

Problem: Given an array, find if there exists a subarray with a given sum.

Example:
Input: arr = [1, 4, 20, 3, 10, 5], target = 33
Output: Subarray with sum 33 found: [20, 3, 10]
 */


public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        boolean found = false;

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum += arr[j];
                if(sum == target) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        if(!found)
            System.out.println("No subarray found with sum " + target);
    }
}

// Subarray found from index 2 to 4



//Logic: Try all subarrays using two loops & check sum.
//Time Complexity: O(n²) (can be optimized using prefix sum or sliding window).

