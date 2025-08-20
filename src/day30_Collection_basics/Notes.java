package day30_Collection_basics;

public class Notes {
    public static void main(String[] args) {


        /*

        What is Java Collection Framework?

The Java Collection Framework (JCF) is a set of classes and interfaces in the java.util
package that provide ready-made data structures and algorithms
(like lists, sets, maps, queues, sorting, searching, etc.).

It solves problems of traditional arrays:

Fixed size
No built-in methods (search, sort, etc.)
No dynamic resizing
No built-in hashing or orderingWhat is Java Collection Framework?


Main Interfaces in JCF

1.Collection Interface (root of the framework)
    List → Ordered, allows duplicates
        Classes: ArrayList, LinkedList, Vector, Stack
    Set → Unordered, no duplicates
        Classes: HashSet, LinkedHashSet, TreeSet
    Queue → Follows FIFO (some allow priority)
        Classes: PriorityQueue, ArrayDeque
2.Map Interface (key-value pairs, not part of Collection)
    Classes: HashMap, LinkedHashMap, TreeMap, HashTable, ConcurrentHashMap, WeakHashMap, EnumMap, IdentityHashMap

Utility Classes
    Collections class → helper methods for collections
        sort(), reverse(), shuffle(), binarySearch(), max(), min()
    Arrays class → helper methods for arrays
        sort(), asList(), binarySearch(), equals(), copyOf()

Advantages of JCF
-Predefined data structures → less coding effort
-Increases code reusability
-Dynamic sizing
-Thread-safe options available (Vector, ConcurrentHashMap)
-Built-in algorithms (sorting, searching, shuffling)

Common Interview Questions on JCF

1.Difference between ArrayList vs LinkedList
2.Difference between HashMap vs Hashtable
3.Difference between HashSet vs TreeSet
4.How does HashMap internally work?
5.Why ConcurrentHashMap is faster than Hashtable?
6.Difference between fail-fast and fail-safe iterators?
7.How to sort a list of objects using Comparator and Comparable?
8.Why is Map not part of the Collection hierarchy?
9.Difference between HashMap vs IdentityHashMap?
10.When to use WeakHashMap?


=> Java Collection Framework Hierarchy

               Iterable (interface)
                     |
              Collection (interface)
   ------------------------------------------------
   |                        |                      |
   List (interface)         Set (interface)        Queue (interface)
   |                        |                      |
   |                        |                      |
ArrayList               HashSet                PriorityQueue
LinkedList              LinkedHashSet          ArrayDeque
Vector                  TreeSet
Stack                   EnumSet
                        SortedSet (interface)
                        NavigableSet (interface)


=> Map Hierarchy (separate, not under Collection)

              Map (interface)
   ----------------------------------------------------
   |             |               |          |          |
 HashMap     LinkedHashMap     TreeMap   Hashtable   EnumMap
   |                                      |
ConcurrentHashMap                   Properties
WeakHashMap
IdentityHashMap


=> Utility Classes (Helper for Collections & Arrays)

Collections class
    - Provides static utility methods for collections like sort(), binarySearch(),
        reverse(), shuffle(), min(), max(), unmodifiableList(), etc.

Arrays class
    - Provides static utility methods for arrays like sort(), binarySearch(),
        asList(), copyOf(), equals(), fill(), stream(), etc.


Iterable Interface

1. What is Iterable?
    Iterable is the root interface of the Java Collection Framework.
    Every collection class like List, Set, and Queue implements Iterable (directly or indirectly).
    It was introduced in Java 5 as part of the Enhanced For Loop (for-each loop) feature.

Declaration:

public interface Iterable<T> {
    Iterator<T> iterator();
}


2. Why Iterable?
    It allows a collection of objects to be iterated one by one.
    Without Iterable, we couldn’t use the for-each loop (for(Object o : collection)).
    It provides a standard way to loop through collections.

3. Methods in Iterable Interface
| Method                                         | Description                                  |
| ---------------------------------------------- | -------------------------------------------- |
| `Iterator<T> iterator()`                       | Returns an iterator for traversing elements. |
| `forEach(Consumer<? super T> action)` (Java 8) | Performs an action for each element.         |
| `Spliterator<T> spliterator()` (Java 8)        | Used for parallel stream processing.         |


4. Example 1 – Using Iterable with ArrayList

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Munna");
        names.add("Aziz");
        names.add("Ravi");

        // ✅ Using Iterator (from Iterable)
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ✅ Using Enhanced For Loop (because of Iterable)
        for (String name : names) {
            System.out.println(name);
        }

        // ✅ Using forEach() (Java 8+)
        names.forEach(System.out::println);
    }
}


5. Key Points

    Iterable makes Collections framework unified under one common interface.
    Iterator is returned by iterator() method and provides next(), hasNext(), and remove().
    Iterable → Collection → List/Set/Queue.
    Even Map is not directly iterable (since it’s key-value), but you can iterate using entrySet(), keySet(), or values().


1. Iterable (Interface)
    Package: java.lang
    Purpose: Represents a collection of elements that can be traversed.

Definition:

public interface Iterable<T> {
    Iterator<T> iterator();
}


Key Points:
    It is the root interface of the Collection framework.
    It only has one abstract method → iterator().
    Any class implementing Iterable must provide an Iterator to iterate over elements.
    Enables usage of for-each loop (for(T item : collection)).
Example: List, Set, Queue all implement Iterable.


2. Iterator (Interface)
    Package: java.util
    Purpose: Provides methods to traverse elements one by one.

Definition:

public interface Iterator<E> {
    boolean hasNext();
    E next();
    default void remove();   // optional operation
}


Key Points:
    Used to actually traverse the elements of a collection.
    Provides:
        hasNext() → checks if more elements exist
        next() → returns next element
        remove() → removes the current element (optional)

Internal Difference
| Feature              | Iterable                                                              | Iterator                                      |
| -------------------- | --------------------------------------------------------------------- | --------------------------------------------- |
| **Location**         | `java.lang`                                                           | `java.util`                                   |
| **Role**             | Provides the ability to return an `Iterator`                          | Provides methods to traverse elements         |
| **Method**           | `iterator()`                                                          | `hasNext()`, `next()`, `remove()`             |
| **For-each support** | Enables enhanced for-each loop                                        | Cannot directly support for-each              |
| **Usage**            | Defines a collection that can be iterated                             | Defines the cursor to traverse the collection |
| **Example**          | `List<String> list = new ArrayList<>();` (list implements `Iterable`) | `Iterator<String> it = list.iterator();`      |



Example with Both

import java.util.*;

public class IterableVsIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Microservices");

        // Iterable usage -> for-each loop
        for (String item : list) {
            System.out.println("Iterable: " + item);
        }

        // Iterator usage -> manual traversal
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }
    }
}


In Simple Words

Iterable = Contract → says "This collection can be iterated. I’ll give you an Iterator."
Iterator = Worker → says "I’ll move through the collection one by one."


         */
    }
}
