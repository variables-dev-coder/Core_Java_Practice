package day33_Collection_Queue_Interface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);

        // Smallest element comes first
        System.out.println("Top Priority Element: " + pq.peek());

        System.out.println("Removing elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  // 10, 20, 30
        }
    }
}


/*
PriorityQueue: [10, 30, 20]   // order may vary, but peek/poll will give min
Top Priority Element: 10
Removing elements in priority order:
10
20
30


 */