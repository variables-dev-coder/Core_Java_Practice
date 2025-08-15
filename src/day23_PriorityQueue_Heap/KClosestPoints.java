package day23_PriorityQueue_Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {
    public static int[][] kClosest(int[][] points, int k) {

        // Max Heap: farthest point on top
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])
        );

        // Add points
        for (int[] p : points) {
            maxHeap.offer(p);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove farthest
            }
        }

        // Extract k points
        int[][] result = new int[k][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            result[i++] = maxHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        int[][] ans = kClosest(points, k);

        for (int[] p : ans) {
            System.out.println(Arrays.toString(p));
        }
    }
}

/*
Dry Run

points = [[3,3],[5,-1],[-2,4]], k = 2
Push (3,3) → heap = [(3,3)]
Push (5,-1) → heap = [(5,-1), (3,3)] (distance 26 > 18)
Push (-2,4) → heap = [(5,-1), (3,3), (-2,4)] → remove (5,-1) → heap = [(3,3), (-2,4)]

Output = [(3,3), (-2,4)]
 */