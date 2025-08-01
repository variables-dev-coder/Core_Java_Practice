package day33_Collection_Queue_Interface;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeQueueExample {
    public static void main(String[] args) {
        Queue<String> deque = new ArrayDeque<>();

        deque.offer("Spring");
        deque.offer("Boot");
        deque.offer("Microservices");

        System.out.println("Queue: " + deque);           // [Spring, Boot, Microservices]
        System.out.println("Peek: " + deque.peek());     // Spring
        System.out.println("Poll: " + deque.poll());     // Spring
        System.out.println("After Poll: " + deque);      // [Boot, Microservices]
    }
}
