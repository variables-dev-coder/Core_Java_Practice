package day12_Arrays_Strings_DSA;


// You are given two arrays. Merge them into a single array.

public class MergeTwoArrays_2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};

        // Create merged array with total size
        int[] merged = new int[arr1.length + arr2.length];

        // Copy elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Printing Merge array
        System.out.println("Merged Array: ");
        for (int num : merged) {
            System.out.println(num + " ");
        }
    }
}
