package day43_Collection_PriorityQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}

/*
Queue: [Alice, Bob, Charlie]
Processing: Alice
Processing: Bob
Processing: Charlie

 */
