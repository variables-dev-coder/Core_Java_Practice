package day23_PriorityQueue_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Max - Heap with (value, index)
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            // Add current element with index
            maxHeap.offer(new int[] {nums[i], i});

            // Remove elements outside the window
            while (maxHeap.peek()[1] <= i - k)
                maxHeap.poll();

            // Record max from heap
            if (i >= k -1)
                result[i - k + 1] = maxHeap.peek()[0];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));

    }
}
