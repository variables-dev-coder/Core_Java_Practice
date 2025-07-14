package day25_Binary_Heap_Implementation;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> distance(b) - distance(a)
        );

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.toArray(new int[k][2]);
    }

    private static int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;
        int[][] result = kClosest(points, k);
        for (int[] p : result)
            System.out.println(Arrays.toString(p));
    }
}
