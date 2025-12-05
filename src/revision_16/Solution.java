package revision_16;

public class Solution {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its correct index
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Find the first index where value != index + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 4, -1, 1};
        System.out.println(sol.firstMissingPositive(arr)); // Output: 2
    }
}
