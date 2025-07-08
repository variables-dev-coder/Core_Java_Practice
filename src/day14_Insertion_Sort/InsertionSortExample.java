package day14_Insertion_Sort;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr= {9, 5, 1, 4};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;     // insert
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
