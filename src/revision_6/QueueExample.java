package revision_6;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // Peek head
        System.out.println("Head (peek): " + queue.peek());

        // Remove elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removals: " + queue);
    }
}

/*
Dry Run

Insert → 10, 20, 30 → Queue = [10, 20, 30]

peek() → shows 10 (front, but doesn’t remove).

poll() → removes 10, Queue = [20, 30].

Next poll() → removes 20, Queue = [30].

Final → [30].

 */