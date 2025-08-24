package revision_5;

/*
Sorting-based
(a) Sort 0s, 1s, 2s (Dutch National Flag)
 */


public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low]; nums[low] = nums[mid]; nums[mid] = temp;
                low++; mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid]; nums[mid] = nums[high]; nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for (int x : arr) System.out.print(x + " "); // 0 0 1 1 2 2
    }
}
