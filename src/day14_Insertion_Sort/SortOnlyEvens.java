package day14_Insertion_Sort;

public class SortOnlyEvens {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        // Extract even number with their indexes
        int[] evens = new int[arr.length];
        int k = 0;
        for (int num : arr) {
            if (num % 2 == 2) {
                evens[k++] = num;
            }
        }

        // Insertion sort only evens
        for (int i = 1; i < k; i++) {
            int temp = evens[i];
            int j = i - 1;
            while (j >= 0 && evens[j] > temp) {
                evens[j + 1] = evens[j];
                j--;
            }
            evens[j + 1] = temp;
        }

        // Replace sorted evens in original positions
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evens[evenIndex++];
            }
        }

        // print final array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
