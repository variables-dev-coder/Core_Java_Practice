package day44_Collection_Deque;


/*

Problem: Sliding Window Maximum

You are given an array nums[] and a window size k.
Find the maximum element in every sliding window of size k.

Example:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]

Logic Explanation

We use Deque to store indexes of elements:
    1.Deque will always maintain decreasing order of values (front → largest).
    2.Before inserting new element:
        Remove smaller elements from the back (they’re useless, since new bigger one will cover future windows).
        Remove elements from the front if they are outside the current window.
    3.The front of deque always holds the index of the max element for the current window.



 */

import java.util.*;


public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // 1. Remove elements out of window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // 2. Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // 3. Add current element index
            deque.offerLast(i);

            // 4. Add max to result (when we have at least k elements processed)
            if (i >= k - 1) {
                result[ri++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(result));
    }
}

//[3, 3, 5, 5, 6, 7]

/*
Dry Run (nums = [1,3,-1,-3,5,3,6,7], k=3)

i=0 → [1] → deque=[0] → no result

i=1 → [1,3] → remove 1 (smaller), deque=[1] → no result

i=2 → [1,3,-1] → deque=[1,2] → result[0]=3

i=3 → [3,-1,-3] → deque=[1,2,3] → result[1]=3

i=4 → [5,-1,-3] → remove smaller, deque=[4] → result[2]=5

i=5 → [5,3] → deque=[4,5] → result[3]=5

i=6 → [6,3] → remove smaller, deque=[6] → result[4]=6

i=7 → [7,6] → remove smaller, deque=[7] → result[5]=7

Output: [3,3,5,5,6,7]

Time Complexity

Each element is added and removed at most once → O(n)
Space → O(k) for deque.


 */