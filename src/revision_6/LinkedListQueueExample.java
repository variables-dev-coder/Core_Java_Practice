package revision_6;

/*
LinkedList as Queue
Why? LinkedList implements Queue, supports offer(), poll(), peek().
Use case: Classic FIFO queue.
Problem 1: Implement a ticketing system where people stand in a queue.
 */


import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        // Dequeue
        System.out.println("Serving: " + queue.poll());
        System.out.println("Serving: " + queue.poll());

        // Peek next
        System.out.println("Next: " + queue.peek());
        System.out.println("Queue after service: " + queue);
    }
}

/*
Dry Run:

Insert Alice → [Alice]

Insert Bob → [Alice, Bob]

Insert Charlie → [Alice, Bob, Charlie]

Poll → removes Alice → [Bob, Charlie]

Poll → removes Bob → [Charlie]

Peek → shows Charlie

FIFO order maintained.
 */