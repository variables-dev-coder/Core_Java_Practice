package day16_PriorityQueue_Heap;

// Max-Heap using PriorityQueue in Java
// By default, Java gives Min-Heap. To get a Max-Heap, use a custom comparator


import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(20);
        maxHeap.offer(50);
        maxHeap.offer(7);
        maxHeap.offer(11);

        System.out.println("To (largest): " + maxHeap.peek());

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll() + " ");
        }
    }
}
