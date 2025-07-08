package day14_Insertion_Sort;

public class CountSwapsInsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1};
        int swaps = 0;

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
                swaps++;
            }

            arr[j + 1] = current;
        }

        System.out.println("Total Swaps: " + swaps);
    }
}
