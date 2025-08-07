package day19_Merge_Sort;

import java.util.Arrays;

public class MergeSortExample3 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        // Base case: if the left index is less than the right then
        if (left < right) {
            // find mid
            int mid = left + (right - left) / 2;

            // recursively sort first half
            mergeSort(arr, left, mid);

            // recursively sort second half
            mergeSort(arr, mid + 1, right);

            // merge the two sorted halves
            merge(arr, left, mid, right);
        }
    }

    // merge two sorted subarray
    public static void merge(int[] arr, int left, int mid, int right) {
        // size of the two subarray
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        // Initial indexes of the two subarrays
        int i = 0, j = 0;
        int k = left;

        // merge the temporary array
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

        // copy any remaining element of leftArray[]
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // copy any remaining element of rightArray[]
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
