package day23_PriorityQueue_Heap;

// Continuously add numbers and return median at any time.

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (minHeap.size() > maxHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public double findMedia() {
        if (maxHeap.size() == minHeap.size())
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        else
            return maxHeap.peek();
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedia());
        mf.addNum(3);
        System.out.println(mf.findMedia());
    }
}
