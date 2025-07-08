package day14_Insertion_Sort;

public class InsertionSortAscending {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
