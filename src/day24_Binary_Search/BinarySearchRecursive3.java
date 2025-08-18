package day24_Binary_Search;

public class BinarySearchRecursive3 {
    public static int binarySearchRec(int[] arr, int low, int high, int target) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target ) return mid;
        else if (arr[mid] < target) return binarySearchRec(arr, mid + 1, high, target);
        else return binarySearchRec(arr, low, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int index = binarySearchRec(arr,  0,arr.length - 1, target);

        System.out.println("Index of " + target + " = " + index);
    }
}
