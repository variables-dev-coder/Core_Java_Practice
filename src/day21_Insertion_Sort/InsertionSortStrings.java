package day21_Insertion_Sort;

public class InsertionSortStrings {
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            // Compare strings using compareTo()
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Place key at correct position
        }
    }

    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry", "mango", "grape"};

        System.out.println("Before Sorting: ");
        for (String word : arr) {
            System.out.print(word + " ");
        }

        insertionSort(arr);

        System.out.println("\nAfter Sorting: ");
        for (String word : arr) {
            System.out.print(word + " ");
        }
    }
}
