package revision_5;

/*
Maximum Subarray (Kadane’s Algorithm)

Problem: Find the contiguous subarray with maximum sum.

Example:
Input: arr = [-2,1,-3,4,-1,2,1,-5,4]
Output: Max Subarray Sum = 6 (subarray [4,-1,2,1])
 */


public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSoFar = arr[0];
        int currentSum = arr[0];

        for(int i=1; i<arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        System.out.println("Maximum Subarray Sum = " + maxSoFar);
    }
}

// Maximum Subarray Sum = 6

/*


Logic:

At each element, decide: take current element alone OR extend previous subarray.

Keep updating max sum.
Time Complexity: O(n)
 */