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



Again :
-------
Collection (Interface)
    Definition: Collection is the root interface in the Collection Framework.
    Package: java.util
    Purpose: Represents a group of objects, known as elements.
    Implemented by: List, Set, Queue etc.
    Key Methods: add(), remove(), size(), iterator(), clear(), isEmpty()
    Think of it as the blueprint for different types of collections.



Collections (Utility Class)
    Definition: Collections is a utility/helper class that provides static methods to operate on collections.
    Package: java.util
    Purpose: Contains methods like sorting, searching, synchronization, making collections unmodifiable, etc.

Examples of Methods:
    Collections.sort(list) → sorts a list
    Collections.reverse(list) → reverses elements in a list
    Collections.max(list) / Collections.min(list) → finds max or min
    Collections.synchronizedList(list) → makes list thread-safe

Think of it as a toolbox with ready-made operations for working on collections.


Quick Comparison Table

| Feature    | **Collection** (Interface)      | **Collections** (Class)              |
| ---------- | ------------------------------- | ------------------------------------ |
| Type       | Interface                       | Utility Class                        |
| Belongs to | java.util package               | java.util package                    |
| Usage      | To represent a group of objects | To perform operations on collections |
| Example    | `List`, `Set`, `Queue`          | `Collections.sort(list)`             |



Example Code:

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Collection (Interface) example
        Collection<String> names = new ArrayList<>();
        names.add("Munna");
        names.add("Aziz");
        names.add("Java");

        System.out.println("Collection Elements: " + names);

        // Collections (Utility Class) example
        List<String> list = new ArrayList<>(names);
        Collections.sort(list);   // Sorting using Collections class
        System.out.println("Sorted List: " + list);
    }
}

1. What is the difference between Collection and Collections in Java?

Collection: An interface in java.util package, the root of the collection hierarchy.
It defines methods like add(), remove(), size().

Collections: A utility class in java.util package that contains static methods for
operations like sorting, searching, synchronizing, etc.



2. Is Collection a class or an interface? What about Collections?

Collection → Interface (cannot be instantiated).
Collections → Final class (cannot be extended).


3. Can you create an object of Collection and Collections?

Collection: Cannot create object directly (since it’s an interface).
We use implementations like ArrayList, HashSet.

Collections: Cannot create object (since constructor is private). Only static methods are used.


4. Give examples of methods from Collections class.

Collections.sort(list) → Sorts list.
Collections.reverse(list) → Reverses order.
Collections.max(list) → Finds maximum.
Collections.synchronizedList(list) → Returns synchronized list.


5. In which scenarios do we use Collection vs Collections?

Collection → When defining data structures (List, Set, Queue).
Collections → When performing operations on those data structures (sort, search, shuffle, synchronization).

So the short trick to remember:

Collection → Interface (data structure hierarchy).
Collections → Utility class (helper methods).

Comparison Table: Collection vs Collections

| Feature             | **Collection**                                                   | **Collections**                                                                   |
| ------------------- | ---------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| **Type**            | Interface                                                        | Utility Class                                                                     |
| **Package**         | `java.util`                                                      | `java.util`                                                                       |
| **Purpose**         | Root interface of the Collection hierarchy (List, Set, Queue)    | Utility class with static methods to operate on collections                       |
| **Inheritance**     | Extended by `List`, `Set`, `Queue`                               | Final class (cannot be inherited)                                                 |
| **Methods**         | Defines methods like `add()`, `remove()`, `size()`, `iterator()` | Provides static methods like `sort()`, `reverse()`, `shuffle()`, `max()`, `min()` |
| **Object Creation** | Cannot create object directly (it’s an interface)                | Cannot create object (all methods are static)                                     |
| **Example**         | `Collection<String> list = new ArrayList<>();`                   | `Collections.sort(list);`                                                         |


example

import java.util.*;

public class CollectionVsCollectionsDemo {
    public static void main(String[] args) {
        // Using Collection (interface)
        Collection<String> names = new ArrayList<>();
        names.add("Munna");
        names.add("Aziz");
        names.add("Rahul");

        System.out.println("Collection Example: " + names);

        // Using Collections (utility class)
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        System.out.println("Before Sorting: " + numbers);

        Collections.sort(numbers);  // Sorting
        System.out.println("After Sorting: " + numbers);

        Collections.reverse(numbers);  // Reversing
        System.out.println("After Reversing: " + numbers);

        int max = Collections.max(numbers);
        System.out.println("Max element: " + max);
    }
}

Key Takeaway:

Collection → Blueprint (Interface)
Collections → Helper (Utility Class)


Visual Hierarchy: Collection vs Collections

                  ┌─────────────────────────┐
                  │      Collection          │ (Interface)
                  └─────────────────────────┘
                             │
     ┌───────────────────────┼───────────────────────────┐
     │                       │                           │
 ┌─────────┐            ┌───────────┐             ┌──────────┐
 │  List   │            │   Set     │             │  Queue   │
 └─────────┘            └───────────┘             └──────────┘
     │                       │                           │
ArrayList, LinkedList   HashSet, TreeSet          PriorityQueue, Deque
Vector, Stack           LinkedHashSet             ArrayDeque, LinkedList
                        etc.                      etc.


                  ┌─────────────────────────┐
                  │      Collections         │ (Utility Class - java.util)
                  └─────────────────────────┘
                             │
          Provides static utility methods to operate on collections:
          ────────────────────────────────────────────────────────────
          - sort(List<T> list)
          - binarySearch(List<T> list, key)
          - reverse(List<?> list)
          - shuffle(List<?> list)
          - min(Collection<T> coll)
          - max(Collection<T> coll)
          - unmodifiableList(), synchronizedList(), etc.


Key takeaway from diagram:

Collection = root interface in hierarchy → List, Set, Queue.
Collections = utility/helper class → provides static methods like sort(), reverse(), etc.


         */
    }
}
