package day24_Binary_Search;

public class BinarySearchRec {
    public static int binarySearchRec(int[] arr, int low, int high, int target) {

        // base case
        if (low > high) return -1;

        int mid = low + (high - low ) / 2;

        if (arr[mid] == target) return mid;

        else if (arr[mid] < target) return binarySearchRec(arr, mid + 1, high, target);

        else return binarySearchRec(arr, low, mid - 1, target);

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int target = 16;
        int index = binarySearchRec(arr, 0, arr.length - 1, target);
        System.out.println("Index of " + target + " = " + index);
    }
}
