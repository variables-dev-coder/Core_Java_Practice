package day21_Insertion_Sort;

public class InsertionSortExample2 {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place key at its correct position
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 9, 1, 2, 0};

        System.out.println("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
