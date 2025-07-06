package day14_Bubble_Sort;

public class BubbleSort_2 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 6, 7, 1, 3, 5, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;


            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: break early if no swaps
            if(!swapped) break;
        }
        System.out.print("Sorted array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
