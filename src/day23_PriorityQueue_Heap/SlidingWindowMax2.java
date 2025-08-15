package day23_PriorityQueue_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SlidingWindowMax2 {
    public static int[] maxSlidingWindow(int[] nums, int k) {

        // Max Heap that stores [value, index]
        PriorityQueue<int[]> maxheap = new PriorityQueue<>(
                (a, b) -> b[0] - a[0]      // Sort by value (descending)
        );

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;   // result index

        // process each element
        for (int i = 0; i < n; i++) {
            // Add current element with its index
            maxheap.offer(new int[] { nums[i], i});

            // Remove elements that are out of the current window
            while (maxheap.peek()[1] <= i - k) {
                maxheap.poll();
            }

            // Store max for window starting from index k - 1
            if (i >= k - 1) {
                result[ri++] = maxheap.peek()[0];   // max value is at top
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}

// // Output: [3,3,5,5,6,7]

/*
Dry Run

nums = [1,3,-1,-3,5,3,6,7], k = 3

Iteration 0: Add (1,0) → max = 1
Iteration 1: Add (3,1) → max = 3
Iteration 2: Add (-1,2) → max = 3 → result[0] = 3
Iteration 3: Add (-3,3) → remove (1,0) → max = 3 → result[1] = 3
Iteration 4: Add (5,4) → max = 5 → result[2] = 5
Iteration 5: Add (3,5) → max = 5 → result[3] = 5
Iteration 6: Add (6,6) → max = 6 → result[4] = 6
Iteration 7: Add (7,7) → max = 7 → result[5] = 7
 */