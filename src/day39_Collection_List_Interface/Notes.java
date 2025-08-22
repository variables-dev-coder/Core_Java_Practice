package day39_Collection_List_Interface;

public class Notes {
    public static void main(String[] args) {
        /*

1. List Interface Overview
    A sub-interface of Collection.
    Allows ordered collection (elements are stored in the same order as inserted).
    Allows duplicates.
    Supports index-based access.

2. Important Implementations

- ArrayList
    Backed by a dynamic array.
    Fast random access (O(1)).
    Slow insert/delete in the middle (O(n)).
    Best when you do more read operations.

- LinkedList
    Doubly linked list implementation.
    Fast insertion/deletion at head, tail, or middle (O(1) for ends, O(n) for index).
    Slow random access (O(n)).
    Best when you do more insert/delete operations.

- Vector
    Similar to ArrayList but synchronized (thread-safe).
    Slower compared to ArrayList in single-threaded apps.
    Rarely used in modern apps (legacy).

- Stack (extends Vector)
    LIFO (Last-In, First-Out) data structure.
    Methods: push(), pop(), peek(), empty().
    Used when stack-like behavior is needed.

3. Key Features
    Indexing: Access elements via list.get(index).
    Duplicates allowed: list.add("A"); list.add("A");
    Order maintained.
    CRUD Operations: Create, Read, Update, Delete.
    Iteration: For-each, Iterator, ListIterator, Streams.


         */
    }
}
