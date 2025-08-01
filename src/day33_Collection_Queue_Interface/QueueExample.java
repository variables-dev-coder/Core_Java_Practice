package day33_Collection_Queue_Interface;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Munna");
        queue.add("Aziz");
        queue.offer("Rahul");

        System.out.println("Queue: " + queue);

        System.out.println("Peek (front element): " + queue.peek()); // Munna

        System.out.println("Poll (remove front): " + queue.poll()); // Munna
        System.out.println("Queue after poll: " + queue);

        System.out.println("Remove: " + queue.remove()); // Aziz
        System.out.println("Queue now: " + queue);

    }
}

/*

Queue: [Munna, Aziz, Rahul]
Peek (front element): Munna
Poll (remove front): Munna
Queue after poll: [Aziz, Rahul]
Remove: Aziz
Queue now: [Rahul]

 */

/*

1. Queue Interface in Java – Introduction
    A Queue is a linear data structure that follows the FIFO rule:
    First In, First Out.

    Java provides the Queue interface in java.util package.

    It is typically used for order processing, task scheduling, data buffering, etc.

2. Queue is an interface
So we can't directly create an object of Queue; we use its implementations like:

    LinkedList (most commonly used)

    PriorityQueue (for priority-based ordering)

    ArrayDeque (for double-ended queue)


 */