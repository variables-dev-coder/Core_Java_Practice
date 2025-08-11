package day21_Insertion_Sort;

public class InsertionSortDemo {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than the key to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;    // Place key in correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Before Sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\nAfter Sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Iteration 1 (i=1, key=11)
Compare 12 > 11 → shift 12 → {12, 12, 13, 5, 6}
Insert 11 → {11, 12, 13, 5, 6}

Iteration 2 (i=2, key=13)
Compare 12 < 13 → no shift → {11, 12, 13, 5, 6}

Iteration 3 (i=3, key=5)
Compare 13 > 5 → shift → {11, 12, 13, 13, 6}
Compare 12 > 5 → shift → {11, 12, 12, 13, 6}
Compare 11 > 5 → shift → {11, 11, 12, 13, 6}
Insert 5 → {5, 11, 12, 13, 6}

Iteration 4 (i=4, key=6)
Compare 13 > 6 → shift → {5, 11, 12, 13, 13}
Compare 12 > 6 → shift → {5, 11, 12, 12, 13}
Compare 11 > 6 → shift → {5, 11, 11, 12, 13}
Insert 6 → {5, 6, 11, 12, 13}

Sorted Array: {5, 6, 11, 12, 13}
 */