package day12_Arrays_Strings_DSA;


// Sort an Array in Ascending Order (Without Using Arrays.sort())
// Given an array, sort it in ascending order using logic (not built-in methods).

public class SortArrayAscending_3 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Print sorted array
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
