package day36_Collection_Problem;

import java.util.Arrays;
import java.util.List;

public class ArraysClassExample {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 7, 1};

        // Sort
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Convert to List
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        System.out.println("List from array: " + list);

        // Binary Search
        int index = Arrays.binarySearch(arr, 7);
        System.out.println("Index of 7: " + index);
    }
}

/*
Sorted array: [1, 2, 5, 7, 10]
List from array: [10, 20, 30, 40]
Index of 7: 3
 */