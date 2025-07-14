package day17_Queue;

// Java Deque (Double-Ended Queue)
// You can insert and delete from both ends.

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);    // [10]
        deque.addLast(20);     // [10, 20]
        deque.addFirst(30);    // [30, 10, 20]

        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
    }
}
