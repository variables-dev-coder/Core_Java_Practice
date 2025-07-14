package day20_Selection_Sort;

public class CountSwapsInSelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2};
        int swapCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;
            }
        }
        System.out.println("Total swap: " + swapCount);
    }
}
