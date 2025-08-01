package day33_Collection_Queue_Interface;


import java.util.LinkedList;
import java.util.Queue;

public class TicketBooking {
    public static void main(String[] args) {
        Queue<String> bookingQueue = new LinkedList<>();

        // Adding people to the queue
        bookingQueue.add("Alice");     // throws exception if fails
        bookingQueue.offer("Bob");     // returns false if fails
        bookingQueue.offer("Charlie");
        bookingQueue.offer("Diana");

        System.out.println("Initial Queue: " + bookingQueue);

        // Peek at who's first in line (does not remove)
        System.out.println("First in line (peek): " + bookingQueue.peek());

        // Remove first person (simulate ticket issued)
        System.out.println("Ticket issued to: " + bookingQueue.poll());

        System.out.println("Queue after issuing one ticket: " + bookingQueue);

        // Now remove all remaining people one by one
        while (!bookingQueue.isEmpty()) {
            System.out.println("Now serving: " + bookingQueue.remove());
        }

        // Queue is now empty
        System.out.println("Queue empty? " + bookingQueue.isEmpty());

        // Try peek and poll on empty queue
        System.out.println("Peek on empty: " + bookingQueue.peek());  // null
        System.out.println("Poll on empty: " + bookingQueue.poll());  // null

        // This will throw exception
        // System.out.println(bookingQueue.element()); // NoSuchElementException
    }

}

/*

Initial Queue: [Alice, Bob, Charlie, Diana]
First in line (peek): Alice
Ticket issued to: Alice
Queue after issuing one ticket: [Bob, Charlie, Diana]
Now serving: Bob
Now serving: Charlie
Now serving: Diana
Queue empty? true
Peek on empty: null
Poll on empty: null

 */