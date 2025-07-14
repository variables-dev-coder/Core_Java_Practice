package day19_Merge_Sort;

import java.util.Random;

public class LargeMergeSort {

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid) merged[k++] = arr[i++];
        while (j <= end) merged[k++] = arr[j++];

        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        long start = System.currentTimeMillis();
        mergeSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();

        System.out.println("Sorted Successfully in " + (end - start) + " ms");
    }
}
