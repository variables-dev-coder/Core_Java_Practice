package day21_Insertion_Sort;

public class InsertionSortWorstCase {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            //  Shift element greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;   // Place key
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 3, 1};

        System.out.println("Before Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        insertionSort(arr);

        System.out.println("\nAfter Sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*

Dry Run
Iteration 1 (i=1, key=7)
Compare 9 > 7 → shift → {9, 9, 5, 3, 1}

Insert 7 → {7, 9, 5, 3, 1}

Iteration 2 (i=2, key=5)
Compare 9 > 5 → shift → {7, 9, 9, 3, 1}

Compare 7 > 5 → shift → {7, 7, 9, 3, 1}

Insert 5 → {5, 7, 9, 3, 1}

Iteration 3 (i=3, key=3)
Compare 9 > 3 → shift → {5, 7, 9, 9, 1}

Compare 7 > 3 → shift → {5, 7, 7, 9, 1}

Compare 5 > 3 → shift → {5, 5, 7, 9, 1}

Insert 3 → {3, 5, 7, 9, 1}

Iteration 4 (i=4, key=1)
Compare 9 > 1 → shift → {3, 5, 7, 9, 9}

Compare 7 > 1 → shift → {3, 5, 7, 7, 9}

Compare 5 > 1 → shift → {3, 5, 5, 7, 9}

Compare 3 > 1 → shift → {3, 3, 5, 7, 9}

Insert 1 → {1, 3, 5, 7, 9}

Sorted Array: {1, 3, 5, 7, 9}
 */