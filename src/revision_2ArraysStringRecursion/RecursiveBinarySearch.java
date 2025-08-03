package revision_2ArraysStringRecursion;

// Binary Search using Recursion

public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == target) return mid;
        else if (target < arr[mid])
            return binarySearch(arr, target, low, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 10;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("Index of " + target + ": " + result);
    }
}
