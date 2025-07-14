package day25_Binary_Heap_Implementation;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static int minCost(int[] ropes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int r : ropes)
            minHeap.offer(r);

        int totalCost = 0;

        while (minHeap.size() > 1) {
            int a = minHeap.poll();
            int b = minHeap.poll();
            int cost = a + b;
            totalCost += cost;
            minHeap.offer(cost);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println(minCost(ropes));
    }
}
