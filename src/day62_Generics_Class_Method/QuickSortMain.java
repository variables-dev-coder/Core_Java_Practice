package day62_Generics_Class_Method;

//Generic QuickSort

import java.util.Arrays;

class QuickSort {
    public static <T extends Comparable<T>> void sort(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];  // Choose last element as pivot
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                // swap arr[i] and arr[j]
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and pivot
        T temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}

public class QuickSortMain {
    public static void main(String[] args) {
        Integer[] numbers = {34, 7, 23, 32, 5, 62};
        String[] words = {"Banana", "Apple", "Mango", "Cherry"};

        QuickSort.sort(numbers, 0, numbers.length - 1);
        QuickSort.sort(words, 0, words.length - 1);

        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted Words: " + Arrays.toString(words));
    }
}

//Sorted Numbers: [5, 7, 23, 32, 34, 62]
//Sorted Words: [Apple, Banana, Cherry, Mango]