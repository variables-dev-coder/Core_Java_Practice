package day43_Collection_PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SlidingWindowMax {
    static class Pair {
        int val, index;
        Pair(int v, int i) { val = v; index = i; }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.val - a.val);
        int n = nums.length;
        int[] res = new int[n - k + 1];

        for (int i = 0; i < n; i++) {
            pq.add(new Pair(nums[i], i));

            while (pq.peek().index <= i - k) pq.poll(); // remove out-of-window

            if (i >= k - 1) {
                res[i - k + 1] = pq.peek().val;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
        // [3,3,5,5,6,7]
    }
}
