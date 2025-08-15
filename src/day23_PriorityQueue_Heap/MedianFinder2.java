package day23_PriorityQueue_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder2 {
    private PriorityQueue<Integer> maxHeap; // smaller half
    private PriorityQueue<Integer> minHeap; // larger half

    public MedianFinder2() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // Step 1: Add to maxHeap
        maxHeap.offer(num);

        // Step 2: Move largest from maxHeap to minHeap
        minHeap.offer(maxHeap.poll());

        // Step 3: Balance heaps
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        MedianFinder2 mf = new MedianFinder2();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println(mf.findMedian()); // 1.5
        mf.addNum(3);
        System.out.println(mf.findMedian()); // 2
    }
}

/*
Problem:
Design a data structure that supports:
Adding numbers from a stream
Finding the median of all numbers so far in O(log n)

Ex
Input:
addNum(1)
addNum(2)
findMedian() → 1.5
addNum(3)
findMedian() → 2

Approach (Two Heaps)

Use Max Heap for the smaller half of numbers.
Use Min Heap for the larger half of numbers.
Balance heaps so that:
Sizes differ by at most 1
Max Heap contains smaller half, Min Heap contains larger half

Median:
If sizes equal → average of both tops
Else → top of bigger heap


Dry Run

Operations:

add 1 → maxHeap = [1], minHeap = []
add 2 → maxHeap = [1], minHeap = [2] → balance → maxHeap = [2,1], minHeap = [] → median = 1.5
add 3 → maxHeap = [2,1], minHeap = [3] → median = 2

Efficient for streaming data.

 */