package day14_Merge_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenIndexMergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 1, 4, 2};

        List<Integer> evenElements = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            evenElements.add(arr[i]);
        }

        int[] evenArray = evenElements.stream().mapToInt(i -> i).toArray();
        mergeSort(evenArray, 0, evenArray.length - 1);

        int idx = 0;
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = evenArray[idx++];
        }
        System.out.println("Output: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if ( s>= e) return;
        int m = (s + e) / 2;

        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);

        merge(arr, s, m, e);
    }

    public static void merge(int[] arr, int s, int m, int e) {
        int[] merged = new int[e - s + 1];
        int i = s, j = m + 1, k = 0;

        while (i <= m && j <= e) {
            if (arr[i] <= arr[j]) merged[k++] = arr[i++];
            else merged[k++] = arr[j++];
        }

        while (i <= m) merged[k++] = arr[i++];
        while (j <= e) merged[k++] = arr[j++];

        for (int l = 0; l < merged.length; l++) {
            arr[s + l] = merged[l];
        }
    }
}
