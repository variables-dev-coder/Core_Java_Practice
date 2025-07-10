package day16_PriorityQueue_Heap;

// Java PriorityQueue Class (Min-Heap)
// By default, it gives smallest element first (Min-Heap behavior).

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);

        System.out.println("Top (smallest): " + pq.peek());  // 10

        while (!pq.isEmpty()) {
            System.out.println(pq.poll() + " ");
        }
    }
}
