package revision_16;

public class MoveZerosExample {

    public static void moveZeroes(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before: ");
        for (int n : nums) System.out.print(n + " ");

        moveZeroes(nums);

        System.out.println("\nAfter: ");
        for (int n : nums) System.out.print(n + " ");
    }
}

//Before:
//0 1 0 3 12
//After:
//1 3 12 0 0