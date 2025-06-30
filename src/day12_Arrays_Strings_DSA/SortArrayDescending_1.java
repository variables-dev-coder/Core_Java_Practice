package day12_Arrays_Strings_DSA;


// Sort an Array in Descending Order (without Arrays.sort())
// Bubble Sort (just reverse the comparison)
// Instead of checking arr[j] > arr[j + 1], Assending
// we use arr[j] < arr[j + 1] to bring largest numbers forward. Descending


public class SortArrayDescending_1 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 4, 1};

        // Bubble sort for descending
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Print sorted Array
        System.out.println("Sorted (Descending Order) : ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
