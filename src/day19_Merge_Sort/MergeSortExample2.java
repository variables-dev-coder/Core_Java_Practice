package day19_Merge_Sort;

import java.util.Arrays;

public class MergeSortExample2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        // Base case: if the left index is less than the right
        if (left < right) {
            // find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort first half
            mergeSort(arr, left, mid);

            // Recursively sort second half
            mergeSort(arr, mid + 1, right);

            // Merge the two sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted sub arrays: arr[left ... mid] and arr[mid+1...right]
    public static void merge(int[] arr, int left, int mid, int right) {
        // Size of the two sub arrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy to temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        // Initial indexes of the two subarrays
        int i = 0;
        int j = 0;

        // Initial index of merged array
        int k = left;

        // Merge the temp arrays back into arr[left...right]
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of leftArr[]
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements of rightArr
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
