package day16_Queue;

// Java Queue using LinkedList

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (add element)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        // Peek front
        System.out.println("Front: " + queue.peek());

        // Dequeue
        queue.poll();   // remove 10, FIFO

        // Check again
        System.out.println("Front after poll: " + queue.peek());
        System.out.println("Queue Size: " + queue.size());

        // Insert an Element
        System.out.println("Insert an element: " + queue.offer(100));
        System.out.println("After Insert an Element Queue size: " + queue.size());

        queue.offer(80);
        System.out.println("After Insert an Element Queue size: " + queue.size());

        // Queue is empty
        System.out.println("Checking is empty: " + queue.isEmpty());
    }
}
