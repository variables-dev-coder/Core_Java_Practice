package day19_Merge_Sort;

public class InversionCount {
    public static int mergeSort(int[] arr, int s, int e) {
        if (s >= e) return 0;
        int m = (s + e) / 2;
        int count = 0;

        count += mergeSort(arr, s, m);
        count += mergeSort(arr, m + 1, e);
        count += merge(arr, s, m, e);

        return count;
    }

    public static int merge(int[] arr, int s, int m, int e) {
        int[] merged = new int[e - s + 1];
        int i = s, j = m + 1, k = 0, count = 0;

        while (i <= m && j <= e) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
                count += (m - i + 1);  // All elements from i to mid are greater
            }
        }

        while (i <= m) merged[k++] = arr[i++];
        while (j <= e) merged[k++] = arr[j++];

        for (int l = 0; l < merged.length; l++) {
            arr[s + l] = merged[l];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int result = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Inversion Count: " + result);
    }
}
