package day35_Collection_Utility_Classes;

// Binary Search in Sorted Array

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Found at index: " + index);
    }
}
