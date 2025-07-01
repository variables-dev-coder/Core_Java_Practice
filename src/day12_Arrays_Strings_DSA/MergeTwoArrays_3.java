package day12_Arrays_Strings_DSA;

// You are given two arrays. Merge them into a single array.

public class MergeTwoArrays_3 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6};
        int[] arr2 = {8, 1, 5};

        // Merged Array both array1 and array2
        int[] merged = new int[arr1.length + arr2.length];

        // Copy elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Printing merged array
        System.out.println("Merged Array: ");
        for (int num : merged) {
            System.out.println(num + " ");
        }
    }
}
