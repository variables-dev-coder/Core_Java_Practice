package day44_Collection_Deque;

public class Notes {
    public static void main(String[] args) {


        /*


1. What is Deque?

Deque → Double Ended Queue.
    It allows us to insert and remove elements from both ends (front and rear).
    Think of it as a Queue + Stack hybrid.

In Java, Deque is an interface (in java.util).
Common implementations:
    ArrayDeque (most used, backed by resizable array).
    LinkedList (also implements Deque, but slower for most cases).


2. Why ArrayDeque over LinkedList?

Faster (no node overhead like LinkedList).
No capacity restriction (like ArrayList, it resizes automatically).
Not thread-safe (faster than synchronized ones like ConcurrentLinkedDeque).
Cannot store null elements (NullPointerException).


3. Important Methods of Deque

Here’s the cheat sheet you should remember:

| Operation        | Throws Exception | Returns special value (`null/false`) |
| ---------------- | ---------------- | ------------------------------------ |
| **Insert First** | `addFirst(e)`    | `offerFirst(e)`                      |
| **Insert Last**  | `addLast(e)`     | `offerLast(e)`                       |
| **Remove First** | `removeFirst()`  | `pollFirst()`                        |
| **Remove Last**  | `removeLast()`   | `pollLast()`                         |
| **Peek First**   | `getFirst()`     | `peekFirst()`                        |
| **Peek Last**    | `getLast()`      | `peekLast()`                         |



Rule of thumb:
add/remove/get → throws exception if fails.
offer/poll/peek → returns special value (false / null) if fails.


import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // Insert at both ends
        dq.addFirst(10);  // front → 10
        dq.addLast(20);   // 10 ← rear 20
        dq.offerFirst(5); // 5,10,20
        dq.offerLast(25); // 5,10,20,25

        System.out.println("Deque: " + dq);

        // Peek from both ends
        System.out.println("First: " + dq.peekFirst()); // 5
        System.out.println("Last: " + dq.peekLast());   // 25

        // Remove from both ends
        dq.removeFirst(); // removes 5
        dq.pollLast();    // removes 25

        System.out.println("After removals: " + dq); // [10, 20]
    }
}



5.Real-time Use Cases
    Browser history (Back/Forward navigation)
    Undo/Redo operations in editors
    Sliding Window problems in DSA (like Maximum in window size k)
    Palindrome check (insert from both ends)
    Implement Stack (use only addFirst/removeFirst)
    Implement Queue (use addLast/removeFirst)


6.When to Use Deque
    If you only need Queue behavior → use Queue / LinkedList / PriorityQueue.
    If you only need Stack behavior → use Stack / ArrayDeque.
    If you need both ends manipulation → ArrayDeque is best.



         */
    }
}
