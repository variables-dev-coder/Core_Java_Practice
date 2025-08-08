package day20_Selection_Sort;

public class SelectionSortExample {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted sub-array
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum element is at i
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 8, 0};

        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");  // 3 1 5 7 8 0
        }

        selectionSort(arr);

        System.out.println("\nSorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");  // 0 1 3 5 7 8 
        }
    }
}
