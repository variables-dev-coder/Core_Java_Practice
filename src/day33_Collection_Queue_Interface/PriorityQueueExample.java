package day33_Collection_Queue_Interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(10);
        pq.offer(30);

        System.out.println("Queue: " + pq);             // [10, 50, 30] -> order may vary internally
        System.out.println("Peek: " + pq.peek());       // 10 (smallest)
        System.out.println("Poll: " + pq.poll());       // 10 (removed)
        System.out.println("After Poll: " + pq);        // [30, 50]
    }
}
