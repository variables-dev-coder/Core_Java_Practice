package day14_Selection_Sort;

public class SelectionSortAscending {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Outer loop for each index
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = 0;

            // Find the index of the minimum element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if needed
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
