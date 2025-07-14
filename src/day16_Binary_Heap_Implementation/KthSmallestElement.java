package day16_Binary_Heap_Implementation;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : nums) minHeap.offer(n);

        while (--k > 0) minHeap.poll();

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(findKthSmallest(nums, k)); // Output: 7
    }
}
