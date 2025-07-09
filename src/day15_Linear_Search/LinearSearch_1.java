package day15_Linear_Search;

public class LinearSearch_1 {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int index = linearSearch(arr, target);
        System.out.println("Element fount at index: " + index);
    }
}
