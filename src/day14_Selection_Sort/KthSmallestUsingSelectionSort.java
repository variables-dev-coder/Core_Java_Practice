package day14_Selection_Sort;

public class KthSmallestUsingSelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 6, 2, 10};
        int k = 3;

        for (int i = 0; i < k; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("K-th smallest element = " + arr[k - 1]);
    }
}
