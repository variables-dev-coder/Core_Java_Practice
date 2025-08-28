package day43_Collection_PriorityQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10); // Insert
        q.offer(20);
        q.offer(30);

        System.out.println("Queue: " + q); // [10, 20, 30]

        System.out.println("Peek: " + q.peek()); // 10

        System.out.println("Removed: " + q.poll()); // removes 10
        System.out.println("Queue after poll: " + q); // [20, 30]
    }
}
