package day20_Selection_Sort;

public class SelectionSortByDigitSum {

    // helper: calculate sum of digit of a number
    public static int sumOfDigits(int num) {
        num = Math.abs(num);  // Handle negative
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // selection sort based on sum of digits
    public static void selectionSortByDigitSum(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                int sum1 = sumOfDigits(arr[j]);
                int sum2 = sumOfDigits(arr[minIndex]);

                // Compare by digit sum first
                if (sum1 == sum2 && arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {56, 34, 12, 90, 101};

        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSortByDigitSum(arr);

        System.out.println("\nSorted by sum of digits: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
