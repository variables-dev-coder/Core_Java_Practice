package day20_Selection_Sort;

public class SelectionSortByDifference {

    public static void selectionSortByDiff(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                int diff1 = Math.abs(arr[j] - k);
                int diff2 = Math.abs(arr[minIndex] - k);

                if (diff1 < diff2) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 6, 8, 3, 9, 2, 5};
        int k = 7;

        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");  // 10 6 8 3 9 2 5
        }

        selectionSortByDiff(arr, k);

        System.out.println("\nSorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");    // 6 8 9 5 10 3 2
        }
    }
}
