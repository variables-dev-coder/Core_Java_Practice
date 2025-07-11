package day16_PriorityQueue_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        // Max-Heap (reverse comparator)
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones)
            maxHeap.offer(stone);

        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();  // heaviest
            int second = maxHeap.poll(); // second heaviest

            if (first != second)
                maxHeap.offer(first - second); // insert difference
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones)); // Output: 1
    }
}
