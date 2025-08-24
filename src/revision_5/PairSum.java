package revision_5;


/*
Two-Pointer Technique
(a) Pair with given sum

Find if a pair exists with a given sum.
 */


import java.util.Arrays;

public class PairSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Arrays.sort(arr); // Two pointer requires sorted array
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10};
        int target = 14;
        System.out.println(hasPairWithSum(arr, target)); // true (4+10)
    }
}
