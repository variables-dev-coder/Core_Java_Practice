package revision_8;

import java.util.PriorityQueue;

public class KSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) pq.offer(num);

        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }
    }
}
//3
//4
//7