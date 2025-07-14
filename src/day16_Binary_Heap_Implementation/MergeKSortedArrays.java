import java.util.*;

class ArrayNode {
    int val, row, idx;

    ArrayNode(int v, int r, int i) {
        val = v; row = r; idx = i;
    }
}

public class MergeKSortedArrays {
    public static List<Integer> merge(int[][] arrays) {
        PriorityQueue<ArrayNode> heap = new PriorityQueue<>(
                Comparator.comparingInt(a -> a.val)
        );

        for (int i = 0; i < arrays.length; i++)
            if (arrays[i].length > 0)
                heap.offer(new ArrayNode(arrays[i][0], i, 0));

        List<Integer> result = new ArrayList<>();

        while (!heap.isEmpty()) {
            ArrayNode node = heap.poll();
            result.add(node.val);

            if (node.idx + 1 < arrays[node.row].length) {
                heap.offer(new ArrayNode(arrays[node.row][node.idx + 1], node.row, node.idx + 1));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arrays = {
                {1, 4, 5},
                {1, 3, 4},
                {2, 6}
        };

        List<Integer> result = merge(arrays);
        System.out.println(result); // Output: [1,1,2,3,4,4,5,6]
    }
}
