package day22_Linear_Search;

public class LinearSearchRecursive_1 {
    public static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) return -1; // Not found
        if (arr[index] == target) return index;  // Found
        return linearSearch(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(arr, 0, target);
        System.out.println("Fount at index: " + result);
    }
}
