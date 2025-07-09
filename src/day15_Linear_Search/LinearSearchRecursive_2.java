package day15_Linear_Search;

public class LinearSearchRecursive_2 {
    public static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) return -1;    // Not found
        if (arr[index] == target) return index;   // Found
        return linearSearch(arr, index + 1, target);

    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 500};
        int target = 400;

        int result = linearSearch(arr, 0, target);
        System.out.println("Found at index: " + result);
    }
}
