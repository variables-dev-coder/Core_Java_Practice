package day38_Collection_interface;

public class Notes {
    public static void main(String[] args) {

        /*

Collection Interface in Java
    Root interface of the Collection Framework hierarchy (but not of Map hierarchy).
    Declares the common operations for all collections (like add, remove, size, etc).

Implemented by:
    List (ArrayList, LinkedList, Vector, Stack)
    Set (HashSet, LinkedHashSet, TreeSet)
    Queue (PriorityQueue, ArrayDeque, LinkedList Queue)

Methods in Collection Interface

| Method                                      | Description                               |
| ------------------------------------------- | ----------------------------------------- |
| `boolean add(E e)`                          | Adds an element                           |
| `boolean remove(Object o)`                  | Removes element                           |
| `int size()`                                | Returns number of elements                |
| `void clear()`                              | Removes all elements                      |
| `boolean contains(Object o)`                | Checks if element exists                  |
| `boolean isEmpty()`                         | Checks if collection is empty             |
| `Iterator<E> iterator()`                    | Returns an iterator                       |
| `boolean addAll(Collection<? extends E> c)` | Adds all elements from another collection |
| `boolean removeAll(Collection<?> c)`        | Removes all elements that match           |
| `boolean retainAll(Collection<?> c)`        | Keeps only matching elements              |
| `Object[] toArray()`                        | Converts collection to array              |




Difference between Collection and Collections

1. Collection (Interface)
    Type: Interface (in java.util package)
    Definition: It is the root interface in the Collection hierarchy.
    Purpose: Represents a group of objects (called elements).
    Subinterfaces: List, Set, Queue, Deque.
    Implemented by: ArrayList, HashSet, LinkedList, etc.

Example:

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Munna");
        names.add("Java");
        System.out.println(names); // [Munna, Java]
    }
}

2. Collections (Class)
    Type: Utility class (in java.util package)
    Definition: A helper class that contains static methods to operate on or return collections.
    Purpose: Provides methods like sorting, searching, shuffling, synchronization, etc.
    Methods include: sort(), binarySearch(), reverse(), shuffle(), min(), max().

Example:

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        Collections.sort(numbers); // Sorts the list
        System.out.println(numbers); // [1, 2, 3]

        Collections.reverse(numbers);
        System.out.println(numbers); // [3, 2, 1]
    }
}

Quick Comparison Table

| Feature  | **Collection** (Interface)                     | **Collections** (Class)         |
| -------- | ---------------------------------------------- | ------------------------------- |
| Type     | Interface                                      | Class (final)                   |
| Package  | java.util                                      | java.util                       |
| Purpose  | Root of Collection framework                   | Utility methods for collections |
| Contains | Abstract methods                               | Static utility methods          |
| Example  | `Collection<String> list = new ArrayList<>();` | `Collections.sort(list);`       |


Trick to Remember:

Collection → Interface (Framework backbone)
Collections → Utility Class (Helper methods)



         */
    }
}
