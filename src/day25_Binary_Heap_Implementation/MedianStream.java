package day25_Binary_Heap_Implementation;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianStream {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Left
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Right

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size())
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        MedianStream stream = new MedianStream();
        stream.addNum(1);
        System.out.println(stream.findMedian()); // 1
        stream.addNum(2);
        System.out.println(stream.findMedian()); // 1.5
        stream.addNum(3);
        System.out.println(stream.findMedian()); // 2
    }
}
