package day16_Binary_Heap_Implementation;


import java.util.Comparator;
import java.util.PriorityQueue;

class Cell {
    int val;
    int row;
    int col;

    Cell (int v, int r, int c) {
        val = v;
        row = r;
        col = c;
    }
}

public class KthSmallestMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Cell> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(c -> c.val)
        );

        for (int i = 0; i < Math.min(n, k); i++)
            minHeap.offer(new Cell(matrix[i][0], i, 0));

        while (--k > 0) {
            Cell curr = minHeap.poll();
            if (curr.col + 1 < n)
                minHeap.offer(new Cell(matrix[curr.row][curr.col + 1], curr.row, curr.col + 1));
        }
        return  minHeap.poll().val;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        System.out.println(kthSmallest(mat, k));
    }
}
