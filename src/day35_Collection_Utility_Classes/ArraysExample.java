package day35_Collection_Utility_Classes;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {
    public static void main(String[] args) {
        String[] fruits = {"Banana", "Apple", "Mango"};

        Arrays.sort(fruits);
        System.out.println("Sorted array: " + Arrays.toString(fruits));

        List<String> list = Arrays.asList(fruits);
        System.out.println("List: " + list);
    }
}

/*

2. Arrays Class (for array utilities)
-It’s a utility class under java.util.Arrays.
-Contains static methods to manipulate arrays.

| Method                           | Description                |
| -------------------------------- | -------------------------- |
| `sort(array)`                    | Sorts an array             |
| `binarySearch(array, key)`       | Searches for key           |
| `equals(arr1, arr2)`             | Compares arrays            |
| `fill(array, value)`             | Fills with one value       |
| `copyOf(array, newLength)`       | Copies array with new size |
| `copyOfRange(array, start, end)` | Copies part of array       |
| `toString(array)`                | Converts array to String   |
| `asList(array)`                  | Converts array to List     |


 */