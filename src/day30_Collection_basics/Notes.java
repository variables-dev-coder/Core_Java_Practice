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

        
         */
    }
}
