package day35_Collection_Utility_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Munna", "Akash", "Ravi", "Zoya"));

        Collections.sort(names);
        System.out.println("Sorted: " + names); // Ascending

        Collections.reverse(names);
        System.out.println("Reversed: " + names);

        int freq = Collections.frequency(names, "Akash");
        System.out.println("Frequency of Akash: " + freq);
    }
}

/*

1. Collections Class (for Collection framework utilities)

- It's a utility class under java.util.Collections.
- Contains static methods to operate on List, Set, Queue, etc.
- It helps with sorting, searching, reversing, synchronizing, and more

| Method                          | Description                                |
| ------------------------------- | ------------------------------------------ |
| `sort(List)`                    | Sorts a list in ascending order            |
| `reverse(List)`                 | Reverses the order of elements             |
| `shuffle(List)`                 | Randomly permutes the list                 |
| `min(Collection)`               | Finds the minimum element                  |
| `max(Collection)`               | Finds the maximum element                  |
| `frequency(Collection, Object)` | Counts how many times an object appears    |
| `binarySearch(List, key)`       | Performs binary search (sorted list only)  |
| `swap(List, i, j)`              | Swaps elements at i and j                  |
| `fill(List, Object)`            | Replaces all elements with a single object |
| `copy(dest, src)`               | Copies all from src to dest (same size)    |
| `unmodifiableList(List)`        | Returns a read-only list                   |
| `synchronizedList(List)`        | Thread-safe version                        |


 */