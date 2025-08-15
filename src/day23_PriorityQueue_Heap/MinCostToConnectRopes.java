package day23_PriorityQueue_Heap;

import java.util.PriorityQueue;

public class MinCostToConnectRopes {
    public static int connectRopes(int[] ropes) {

        // Min Heap for smallest ropes
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int rope : ropes) {
            minHeap.offer(rope);
        }

        int totalCost = 0;

        // Keep connecting two smallest
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();

            int cost = first + second;
            totalCost += cost;

            minHeap.offer(cost); // push combined rope
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println(connectRopes(ropes)); // Output: 29
    }
}
// 29

/*

Input: ropes = [4, 3, 2, 6]
Output: 29
Explanation:
Step 1: Connect 2 + 3 = cost 5 → ropes = [4, 5, 6]
Step 2: Connect 4 + 5 = cost 9 → ropes = [9, 6]
Step 3: Connect 6 + 9 = cost 15 → ropes = [15]
Total cost = 5 + 9 + 15 = 29


Dry Run

ropes = [4, 3, 2, 6]

Step 1: Heap = [2, 3, 4, 6]
Pop 2 & 3 → cost = 5 → total = 5 → Heap = [4, 5, 6]

Step 2: Heap = [4, 5, 6]
Pop 4 & 5 → cost = 9 → total = 5 + 9 = 14 → Heap = [6, 9]

Step 3: Heap = [6, 9]
Pop 6 & 9 → cost = 15 → total = 14 + 15 = 29 → Heap = [15]

Minimum cost = 29
 */