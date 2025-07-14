package day21_Insertion_Sort;

public class CountMovedElements {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3};
        int[] original = arr.clone();
        int moves = 0;

        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Compare with original
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != original[i]) {
                moves++;
            }
        }
        System.out.println("Sorted Array: ");
        for (int val : arr)
            System.out.println(val + " ");
        System.out.println("\nMoved element: " + moves);
    }
}
