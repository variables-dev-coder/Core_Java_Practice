package revision_5;

/*
Sliding Window
Sliding Window Maximum

Use deque for O(n).
 */

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>(); // store indices

        for (int i = 0; i < n; i++) {
            // Remove elements out of window
            if (!dq.isEmpty() && dq.peek() <= i - k) dq.poll();

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();

            dq.offer(i);

            // Add to result when window is ready
            if (i >= k - 1) res[i - k + 1] = nums[dq.peek()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = maxSlidingWindow(arr, k);
        for (int x : result) System.out.print(x + " "); // 3 3 5 5 6 7
    }
}
