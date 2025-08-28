package day43_Collection_PriorityQueue;


/*
First, let’s recall:

Queue = FIFO (First In, First Out).
PriorityQueue = Elements are ordered based on priority (natural ordering or custom comparator).
Default: min-heap (smallest element has highest priority).
Can create max-heap using a custom comparator.

 */


import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

//Output → 1 5 10 20
//(Smallest element comes out first)