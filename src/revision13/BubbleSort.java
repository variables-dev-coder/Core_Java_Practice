package revision13;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int n = arr.length;

        for (int i = 0; i < n - i - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");  // Sorted array: 1 2 4 5 8
        }
    }
}


//Logic:
//Repeatedly swap adjacent elements until array is sorted.
//Concept: Nested loops, array manipulation.