package day33_Collection_Queue_Interface;

import java.util.PriorityQueue;

public class StringPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Banana");
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Mango");

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek: " + pq.peek());  // Should print Apple

        System.out.println("\nPolling all elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

/*
PriorityQueue: [Apple, Banana, Orange, Mango]
Peek: Apple

Polling all elements in priority order:
Apple
Banana
Mango
Orange

 */