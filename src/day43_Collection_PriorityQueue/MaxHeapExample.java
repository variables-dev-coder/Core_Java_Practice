package day43_Collection_PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

//Output → 20 10 5 1
//(Largest element comes out first)