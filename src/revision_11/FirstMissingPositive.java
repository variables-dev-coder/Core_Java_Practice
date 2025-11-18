package revision_11;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place numbers in their correct positions (cyclic sort idea)
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Identify the first index where number is not correct
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all positions correct, missing number is n+1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr)); // Output: 2
    }
}

// 2