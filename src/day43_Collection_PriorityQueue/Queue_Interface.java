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






This is one of the most asked interview concepts in Queue — when to use
add() vs offer(), remove() vs poll(), element() vs peek().

1. add(e) vs offer(e) → Insert

add(e)
    Inserts the element.
    Throws exception (IllegalStateException) if the queue is full (like in bounded queues).
    Used when failure is considered exceptional.

offer(e)
    Inserts the element.
    Returns true/false if insertion succeeded or failed.
    Used when you want to handle failure gracefully (without exception).

Rule:

    If you want strict insertion and failure is abnormal → add(e).
    If you want safe insertion without exception → offer(e).

2. remove() vs poll() → Delete head

remove()
Deletes and returns head element.
Throws exception (NoSuchElementException) if queue is empty.

poll()
Deletes and returns head element.
Returns null if queue is empty (no exception).

Rule:
If you want exception when queue is empty → remove().
If you want null instead of crash → poll().


3. element() vs peek() → View head

element()
Returns head element without removing.
Throws exception (NoSuchElementException) if queue is empty.

peek()
Returns head element without removing.
Returns null if queue is empty.

Rule:
If you expect the queue always has elements → element().
If you want safe check without exception → peek().

Interview Mnemonic (Easy to Remember):
Exception group → add(), remove(), element()
Safe group → offer(), poll(), peek()


         */
    }
}
