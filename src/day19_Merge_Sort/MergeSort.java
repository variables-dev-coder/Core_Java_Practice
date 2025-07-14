package day19_Merge_Sort;

public class MergeSort {

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

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) merged[k++] = arr[i++];
            else merged[k++] = arr[j++];
        }

        while (i <= mid) merged[k++] = arr[i++];
        while (j <= end) merged[k++] = arr[j++];

        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};
        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr)
            System.out.print(num + " ");

    }
}
