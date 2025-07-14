package day24_Binary_Search;

public class BinarySearch_1 {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 40, 50};
        int target = 30;

        int index = binarySearch(arr, target);
        System.out.println("Element fount at index: " + index);
    }
}
