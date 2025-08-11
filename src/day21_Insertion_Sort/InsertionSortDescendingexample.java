package day21_Insertion_Sort;

public class InsertionSortDescendingexample {

    public static void insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Reverse condition: Place larger numbers first
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Place key at correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {34, 12, 56, 78, 23};

        System.out.println("Before Sorting:");
        for (int num : arr) System.out.print(num + " ");

        insertionSortDescending(arr);

        System.out.println("\nAfter Sorting in Descending Order:");
        for (int num : arr) System.out.print(num + " ");
    }
}

/*
Dry Run
Initial Array: {34, 12, 56, 78, 23}

Iteration 1 (i=1, key=12)
Compare 34 < 12? No → no shift.

{34, 12, 56, 78, 23}

Iteration 2 (i=2, key=56)
Compare 12 < 56 → shift 12 → {34, 34, 56, 78, 23}

Compare 34 < 56 → shift 34 → {56, 34, 12, 78, 23}

Iteration 3 (i=3, key=78)
Compare 12 < 78 → shift 12 → {56, 34, 34, 78, 23}

Compare 34 < 78 → shift 34 → {56, 56, 34, 78, 23}

Compare 56 < 78 → shift 56 → {78, 56, 34, 12, 23}

Iteration 4 (i=4, key=23)
Compare 12 < 23 → shift 12 → {78, 56, 34, 23, 12}

Compare 34 < 23? No → stop.

Sorted in Descending Order: {78, 56, 34, 23, 12}


 */