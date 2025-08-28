package day43_Collection_PriorityQueue;

public class Queue_Interface {
    public static void main(String[] args) {

        /*
Queue Interface Basics

Queue follows FIFO (First In, First Out) principle.
    Defined in java.util package.
    Common methods (from Collection + specific queue ones):
        add(e) / offer(e) → insert
        remove() / poll() → delete head
        element() / peek() → view head


Implementations to Learn

1.LinkedList (basic queue)
2.PriorityQueue (ordered by priority)
3.ArrayDeque (double-ended queue → also used as stack/queue)



Interview Coding Problems (Queue-based)

Implement Queue using Array & Linked List
Implement Circular Queue
Reverse a Queue
Generate binary numbers using Queue
First non-repeating character in a stream



Queue Interface in Java

Package: java.util
Type: Interface (extends Collection)
Nature: FIFO (First-In-First-Out)
Common Implementations:
    LinkedList
    PriorityQueue
    ArrayDeque

Important Queue Methods

| Method       | Description                                 |
| ------------ | ------------------------------------------- |
| `add(E e)`   | Inserts element (throws exception if fails) |
| `offer(E e)` | Inserts element (returns `false` if fails)  |
| `remove()`   | Removes head (throws exception if empty)    |
| `poll()`     | Removes head (returns `null` if empty)      |
| `element()`  | Retrieves head (throws exception if empty)  |
| `peek()`     | Retrieves head (returns `null` if empty)    |



Queue vs PriorityQueue in Java

| Feature                  | **Queue**                                                                                                      | **PriorityQueue**                                                                                                   |
| -------------------------|--------------------------------------------------------------------------------------------------------------- |------------------------------------------------------------------------------------------------------------------- |
| Definition               | A collection designed for holding elements prior to processing, usually in **FIFO** (First-In-First-Out) order.| A special type of Queue where elements are ordered according to **natural ordering** or by a **custom Comparator**. |
| Order                    | Elements are processed in the order they are inserted (FIFO).                                                  | Elements are processed based on **priority** (min-heap by default, smallest/highest priority element first).        |
| Null elements            | Most implementations (like LinkedList as Queue) allow a single `null`.                                         | **Does not allow `null`** elements.                                                                                 |
| Insertion                | `add(e)` / `offer(e)` inserts at the tail.                                                                     | `add(e)` / `offer(e)` inserts based on priority, not position.                                                      |
| Removal                  | `remove()` / `poll()` removes from the head (first inserted element).                                          | `remove()` / `poll()` removes the **highest priority element** (smallest in natural order).                         |
| Peek                     | `peek()` returns the head element (FIFO order).                                                                | `peek()` returns the element with **highest priority** (smallest by default).                                       |
| Underlying Data Structure| Usually **LinkedList** or **ArrayDeque**.                                                                      | Backed by a **binary heap (min-heap)**.                                                                             |
| Use Case                 | Task scheduling, buffer management, request handling.                                                          | Dijkstra’s Algorithm, Huffman Coding, scheduling jobs by priority.                                                  |


In simple terms:

Queue → FIFO (line in a ticket counter).
PriorityQueue → Based on importance (emergency room where critical patients are treated first).



         */
    }
}
