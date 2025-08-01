package day33_Collection_Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Munna");
        queue.offer("Aziz");
        queue.offer("Java");

        System.out.println("Queue: " + queue);         // [Munna, Aziz, Java]
        System.out.println("Peek: " + queue.peek());   // Munna
        System.out.println("Poll: " + queue.poll());   // Munna (removed)
        System.out.println("After Poll: " + queue);    // [Aziz, Java]
    }
}

/*
Queue: [Munna, Aziz, Java]
Peek: Munna
Poll: Munna
After Poll: [Aziz, Java]

 */