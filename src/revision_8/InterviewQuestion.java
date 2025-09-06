package revision_8;

public class InterviewQuestion {

    public static void main(String[] args) {


        /*

1. Difference between ArrayList and LinkedList
----------------------------------------------

| Feature                | ArrayList                               | LinkedList                                   |
| ---------------------- | --------------------------------------- | -------------------------------------------- |
| **Data Structure**     | Dynamic array                           | Doubly linked list                           |
| **Access Time**        | Fast random access `O(1)`               | Sequential access `O(n)`                     |
| **Insertion/Deletion** | Slow in middle `O(n)` (shifting needed) | Fast in middle `O(1)` (change pointers)      |
| **Memory**             | Less memory overhead                    | More memory (extra pointers for prev & next) |
| **Use Case**           | Best for **search-heavy operations**    | Best for **insert/delete-heavy operations**  |


===============================================



2. HashSet vs TreeSet
---------------------

| Feature            | HashSet                                         | TreeSet                              |
| ------------------ | ----------------------------------------------- | ------------------------------------ |
| **Ordering**       | Unordered                                       | Sorted (natural order or comparator) |
| **Performance**    | Faster: add, remove, contains in `O(1)` average | Slower: `O(log n)` operations        |
| **Nulls**          | Allows one `null` element                       | Does not allow `null`                |
| **Implementation** | Backed by `HashMap`                             | Backed by `TreeMap` (Red-Black Tree) |
| **Use Case**       | When order doesn’t matter                       | When sorted order is required        |



===============================================



3. Fail-fast vs Fail-safe Iterators
-----------------------------------

| Feature         | Fail-fast                                                                           | Fail-safe                                   |
| --------------- | ----------------------------------------------------------------------------------- | ------------------------------------------- |
| **Definition**  | Throws `ConcurrentModificationException` if collection is modified during iteration | Does not throw exception even if modified   |
| **Examples**    | `ArrayList`, `HashMap`, `HashSet`                                                   | `CopyOnWriteArrayList`, `ConcurrentHashMap` |
| **Working**     | Directly operates on collection                                                     | Works on a **clone/snapshot** of collection |
| **Performance** | Faster                                                                              | Slightly slower                             |



=================================================



4. HashMap Internal Working
---------------------------
    1.Structure: Array of buckets (each bucket is a linked list or tree).
    2.Hashing:
        Key’s hashCode() → index (bucket).
        Example: index = hashCode(key) & (n - 1) where n = array size.
    3.Collision Handling:
        If multiple keys map to the same bucket → stored in a LinkedList
        (Java 7) or Balanced Tree (Red-Black Tree) (Java 8+ if chain length > 8).
    4.Load Factor & Rehashing:
        Default load factor = 0.75.
        When size exceeds capacity * loadFactor, table is resized (doubled).
    5.Key Lookup:
        Compare hashCode() first, then equals() to confirm exact key.


====================================================



5. Difference between HashMap and Hashtable
-------------------------------------------

| Feature              | HashMap                                        | Hashtable                              |
| -------------------- | ---------------------------------------------- | -------------------------------------- |
| **Thread Safety**    | Not synchronized (faster)                      | Synchronized (slower)                  |
| **Null Keys/Values** | Allows **1 null key** and multiple null values | **No null key** and **no null values** |
| **Introduced**       | Java 1.2 (part of Collections framework)       | Legacy class from Java 1.0             |
| **Performance**      | Better (no sync overhead)                      | Slower                                 |
| **Use Case**         | Multi-thread safety not required               | Multi-thread safety required           |




===================================================



6. Why does HashMap allow one null key but Hashtable doesn’t?
-------------------------------------------------------------

HashMap:
    Allows one null key (all nulls go to same bucket index 0).
    Handles it explicitly in internal code.

Hashtable:
    Old legacy class (before Collections framework).
    For safety in multi-threaded environments, it disallowed null to avoid NullPointerException in synchronization.


==================================================


7. When to use Queue vs Stack?
------------------------------

Queue (FIFO)
    First In, First Out.
    Used for:
        Print job scheduling
        Order processing system
        hread pool task management

Stack (LIFO)
    Last In, First Out.
    Used for:
        Undo/Redo operations
        Expression evaluation (balanced parentheses, postfix evaluation)
        Function call stack in JVM

===================================



8. How does PriorityQueue internally work?
------------------------------------------
    Data Structure: Min-Heap (Binary Heap).
    Ordering: Natural order (Comparable) or custom (Comparator).

Operations:
    offer(e) → Insert element (O(log n))
    poll() → Removes and returns smallest (min) element (O(log n))
    peek() → Retrieves but does not remove head (O(1))

Heap Property:
    For each node, parent ≤ children (in Min-Heap).

Use Case:
    Task scheduling,
    Finding top K elements,
    Dijkstra’s shortest path algorithm.



===========================================


         */


    }
}
