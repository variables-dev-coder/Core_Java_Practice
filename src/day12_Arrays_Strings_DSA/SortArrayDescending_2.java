package day12_Arrays_Strings_DSA;


// Sort an Array in Descending Order (without Arrays.sort())
// Bubble Sort (just reverse the comparison)
// Instead of checking arr[j] > arr[j + 1], Assending
// we use arr[j] < arr[j + 1] to bring largest numbers forward. Descending

public class SortArrayDescending_2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap logic
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Sorted Array Descending
        System.out.println("Sorted Array (Descending) : ");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
