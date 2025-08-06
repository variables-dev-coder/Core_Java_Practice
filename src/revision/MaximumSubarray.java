package revision;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }

        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Choose between extending the previous subarray or starting new
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);

            // Update global maximum if current subarray is larger
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }

    public static void main(String[] args) {
        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test 1: " + maxSubArray(test1)); // 6

        int[] test2 = {1};
        System.out.println("Test 2: " + maxSubArray(test2)); // 1

        int[] test3 = {5, 4, -1, 7, 8};
        System.out.println("Test 3: " + maxSubArray(test3)); // 23

        int[] test4 = {-2, -3, -1, -5};
        System.out.println("Test 4: " + maxSubArray(test4)); // -1
    }
}
