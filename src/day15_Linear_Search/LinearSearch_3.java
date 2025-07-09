package day15_Linear_Search;

public class LinearSearch_3 {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14, 15};
        int target = 13;

        int index = linearSearch(arr, target);
        System.out.println("Element found at index: " + index);
    }
}
