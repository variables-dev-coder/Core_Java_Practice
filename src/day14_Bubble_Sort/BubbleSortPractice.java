package day14_Bubble_Sort;

// Write a Java program to sort an integer array in both ascending and descending order using Bubble Sort algorithm.

public class BubbleSortPractice {

    // Ascending Order
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;

        System.out.print("Ascending Order: ");

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        printArray(arr);

    }

    // Descending order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;

        System.out.print("Descending Order: ");

        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original Array: ");
        printArray(arr);

        // Ascending
        bubbleSortAscending(arr.clone());

        // Descending
        bubbleSortDescending(arr.clone());
    }
}