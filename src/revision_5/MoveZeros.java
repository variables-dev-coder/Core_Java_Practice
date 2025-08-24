package revision_5;
/*
Move zeros to end

Maintain order of non-zeros.
 */


public class MoveZeros {
    public static void moveZeros(int[] nums) {
        int index = 0; // place for non-zero
        for (int num : nums) {
            if (num != 0) nums[index++] = num;
        }
        while (index < nums.length) nums[index++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        for (int x : arr) System.out.print(x + " "); // 1 3 12 0 0
    }
}

// 1 3 12 0 0

