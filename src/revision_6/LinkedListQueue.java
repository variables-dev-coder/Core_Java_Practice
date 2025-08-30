package revision_6;


// Use LinkedList<Integer> to implement a queue (insert at end, delete at front).


import java.util.LinkedList;

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        // Enqueue (insert at end)
        queue.addLast(10);
        queue.addLast(20);
        queue.addLast(30);

        System.out.println("Queue: " + queue);

        // Dequeue (remove from front)
        int removed = queue.removeFirst();
        System.out.println("Removed: " + removed);

        System.out.println("Queue after dequeue: " + queue);
    }
}

//Explanation
//addLast() → insert element at the end (like enqueue).
//removeFirst() → remove element from the front (like dequeue).

/*
Dry Run

Queue initially: []

Enqueue 10 → [10]
Enqueue 20 → [10, 20]
Enqueue 30 → [10, 20, 30]

Dequeue → removes 10 → [20, 30]

Works like a queue (FIFO).


 */