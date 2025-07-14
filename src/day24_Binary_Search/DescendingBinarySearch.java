package day24_Binary_Search;

public class DescendingBinarySearch {
    public static int binarySearchDesc(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] > target)
                low = mid + 1;   // move right
            else
                high = mid -1;    // move left
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50};
        System.out.println("Found at: " + binarySearchDesc(arr, 400));
    }
}
