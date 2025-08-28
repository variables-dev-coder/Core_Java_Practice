package day43_Collection_PriorityQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample4 {
    public static void main(String[] args) {
        Queue<String> serviceQueue = new LinkedList<>();

        serviceQueue.add("Customer1");
        serviceQueue.add("Customer2");
        serviceQueue.add("Customer3");

        while (!serviceQueue.isEmpty()) {
            String customer = serviceQueue.poll();
            System.out.println("Serving: " + customer);
        }
    }
}
/*
Serving: Customer1
Serving: Customer2
Serving: Customer3

 */