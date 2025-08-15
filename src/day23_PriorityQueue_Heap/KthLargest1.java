package day23_PriorityQueue_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest1 {
    public static int findKthLargest(int[] nums, int k) {
        //Max Heap

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.offer(num);
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = maxHeap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));    // Output: 5
    }
}
