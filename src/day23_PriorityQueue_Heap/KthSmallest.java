package day23_PriorityQueue_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static int findKthSmallest(int[] nums, int k) {

        // Max Heap so largest of the k smallest is on top
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to heap
        for (int num : nums) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) { // keep only k elements
                maxHeap.poll();
            }
        }

        // Top is k-th smallest
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(findKthSmallest(nums, k)); // Output: 7
    }
}

/*
Dry Run

nums = [7, 10, 4, 3, 20, 15], k = 3
Insert 7 → heap = [7]
Insert 10 → heap = [10, 7]
Insert 4 → heap = [10, 7, 4]
Insert 3 → heap = [7, 3, 4] (removed 10)
Insert 20 → heap = [7, 3, 4] (removed 20 immediately)
Insert 15 → heap = [7, 3, 4] (removed 15 immediately)

Top = 7 → 3rd smallest.
 */