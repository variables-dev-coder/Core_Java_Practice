package day24_Binary_Search;

public class BinarySearchRecursive_1 {
    public static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;
        else if (arr[mid] < target)
            return binarySearch(arr, mid + 1, end, target);
        else
            return binarySearch(arr, start, mid -1, target);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;

        int index = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println("Element found at index: " + index);
    }
}
