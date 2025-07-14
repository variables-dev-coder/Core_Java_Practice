package day20_Selection_Sort;

public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = {23, 5, 67, 89, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
