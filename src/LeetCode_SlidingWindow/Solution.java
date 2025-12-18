package LeetCode_SlidingWindow;

import java.util.*;

public class Solution {

    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long windowSum = 0;
        long maxSum = 0;

        // 1️⃣ First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            maxSum = windowSum;
        }

        // 2️⃣ Slide window
        for (int i = k; i < nums.length; i++) {
            // remove left element
            int left = nums[i - k];
            windowSum -= left;
            map.put(left, map.get(left) - 1);
            if (map.get(left) == 0) {
                map.remove(left);
            }

            // add right element
            int right = nums[i];
            windowSum += right;
            map.put(right, map.getOrDefault(right, 0) + 1);

            // check distinct
            if (map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }

    // 🔹 MAIN METHOD (for testing)
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        long result = sol.maximumSubarraySum(nums, k);
        System.out.println("Maximum Sum of Distinct Subarray of size " + k + " = " + result);
    }
}

