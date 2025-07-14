package day25_Binary_Heap_Implementation;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) maxHeap.offer(s);

        while (maxHeap.size() > 1) {
            int s1 = maxHeap.poll();
            int s2 = maxHeap.poll();
            if (s1 != s2)
                maxHeap.offer(s1 - s2);
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones)); // Output: 1
    }
}
