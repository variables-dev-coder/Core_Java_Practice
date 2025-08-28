package day43_Collection_PriorityQueue;



import java.util.LinkedList;
import java.util.Queue;


public class QueueExample1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Printing queue
        System.out.println("Queue: " + queue);

        // Removing head
        System.out.println("Removed: " + queue.poll()); // removes 10
        System.out.println("Queue after removal: " + queue);

        // Peek at head
        System.out.println("Peek: " + queue.peek()); // 20
    }
}

/*
Queue: [10, 20, 30]
Removed: 10
Queue after removal: [20, 30]
Peek: 20

 */

 