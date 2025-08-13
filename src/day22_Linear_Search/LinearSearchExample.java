package day22_Linear_Search;

public class LinearSearchExample {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   // Found target at index i
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 32, 56};
        int target = 89;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
