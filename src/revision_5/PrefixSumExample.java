package revision_5;

/*
Prefix Sum Applications

Problem: Find sum of elements in a given range (l to r) efficiently using prefix sum.

Example:
Input: arr = [10, 20, 30, 40, 50]
Queries:

Sum(1, 3) → 20 + 30 + 40 = 90

Sum(0, 4) → 150

 */


public class PrefixSumExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        // Build prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        // Query 1: sum from index 1 to 3
        int l = 1, r = 3;
        int sum1 = prefix[r] - (l > 0 ? prefix[l-1] : 0);
        System.out.println("Sum(1,3) = " + sum1);

        // Query 2: sum from index 0 to 4
        l = 0; r = 4;
        int sum2 = prefix[r] - (l > 0 ? prefix[l-1] : 0);
        System.out.println("Sum(0,4) = " + sum2);
    }
}


//Sum(1,3) = 90
//Sum(0,4) = 150

/*
Logic:

Build prefix array: prefix[i] = arr[0] + arr[1] + ... + arr[i]

Any range sum (l, r) = prefix[r] - prefix[l-1]
Time Complexity: Preprocessing O(n), each query O(1).

 */