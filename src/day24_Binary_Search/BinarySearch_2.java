package day24_Binary_Search;

public class BinarySearch_2 {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {13, 45, 67, 89, 23};
        int target = 89;

        int index = binarySearch(arr, target);
        System.out.println("Element found at index: " + index);
    }
}
