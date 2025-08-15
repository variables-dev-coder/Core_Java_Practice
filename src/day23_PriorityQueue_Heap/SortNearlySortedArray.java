package day23_PriorityQueue_Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortNearlySortedArray {
    public static List<Integer> sortKSortedArray(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        // Add first k+1 elements
        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.offer(arr[i]);
        }

        // Process remaining elements
        for (int i = k+1; i < arr.length; i++) {
            result.add(minHeap.poll());
            minHeap.offer(arr[i]);
        }

        // Empty the heap
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        System.out.println(sortKSortedArray(arr, k));
    }
}
/*
Problem:
You are given an array where each element is at most k positions away from its sorted position.
Sort the array in O(n log k) time.

Example:

Input:  arr = [6, 5, 3, 2, 8, 10, 9], k = 3
Output: [2, 3, 5, 6, 8, 9, 10]

Explanation:
Each number is only a few positions from where it belongs.
Using a min heap of size k+1 will sort efficiently.

Approach (Min Heap)
Put the first k+1 elements into a min heap.
Pop the smallest and append to the result.
Push the next element into the heap.
Repeat until all elements are processed.

Dry Run

arr = [6, 5, 3, 2, 8, 10, 9], k = 3

Step 1: Heap = [2, 5, 3, 6] (first 4 elements)
Step 2: Pop 2 → result = [2] → push 8 → Heap = [3, 5, 6, 8]
Pop 3 → result = [2, 3] → push 10 → Heap = [5, 8, 6, 10]
Pop 5 → result = [2, 3, 5] → push 9 → Heap = [6, 8, 10, 9]
Step 3: Empty heap → [6, 8, 9, 10] appended

Final sorted array = [2, 3, 5, 6, 8, 9, 10]
 */