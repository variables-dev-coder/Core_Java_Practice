package day20_Selection_Sort;

public class SelectionSortBySetBits {

    // Helper: Count number of set bits (1's) in binary
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1; // Check last bit
            num >>= 1;        // Shift right
        }
        return count;
    }

    // Selection Sort based on set bits
    public static void selectionSortBySetBits(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                int bits1 = countSetBits(arr[j]);
                int bits2 = countSetBits(arr[minIndex]);

                // Compare by set bits first
                if (bits1 < bits2) {
                    minIndex = j;
                }
                // If same number of set bits, compare by value
                else if (bits1 == bits2 && arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if needed
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 8, 9};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSortBySetBits(arr);

        System.out.println("\nSorted by set bits:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    } 
}
