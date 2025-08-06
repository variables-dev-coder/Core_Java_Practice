package revision;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return;
        }

        k = k % nums.length; // Handle cases where k > nums.length
        int[] temp = new int[nums.length];

        // Copy last k elements to temp
        System.arraycopy(nums, nums.length - k, temp, 0, k);

        // Copy first n-k elements to temp
        System.arraycopy(nums, 0, temp, k, nums.length - k);

        // Copy back to original array
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1)); // [5,6,7,1,2,3,4]

        int[] nums2 = {-1,-100,3,99};
        rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2)); // [3,99,-1,-100]
    }
}
