package day19_Merge_Sort;

public class MergeSortExample {

    // Main Merge sort method
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // find mid
            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both half
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted parts
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        // Merge
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining

        while (i < n1)
            arr[k++] = leftArr[i++];
        while (j < n2)
            arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Before Sorting: ");
        for (int num : arr)
            System.out.print(num + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Merge Sort: ");
        for(int num : arr)
            System.out.print(num + " ");
    }
}
/*

Before Sorting:
5 2 9 1 5 6
After Merge Sort:
1 2 5 5 6 9

 */