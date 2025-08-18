package day24_Binary_Search;

public class BinarySearch3 {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low ) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else  high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int index = binarySearch(arr, target);

        System.out.println("Element found at " + target + " Index " + index);
    }
}

// Element found at 7 Index 3