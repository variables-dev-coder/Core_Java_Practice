package revision_6;

/*
PriorityQueue
Why? Automatically orders elements based on priority (min-heap by default).
Use case: Jobs scheduling, Dijkstra’s algorithm, Top K problems.
Problem 2: Hospital patient management (low number → higher priority).

 */


import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(5); // patient severity 5
        pq.offer(1); // severity 1
        pq.offer(3);

        System.out.println("Patients queue: " + pq);

        // Serving patients
        while (!pq.isEmpty()) {
            System.out.println("Serving patient severity: " + pq.poll());
        }
    }
}

/*

Patients queue: [1, 5, 3]
Serving patient severity: 1
Serving patient severity: 3
Serving patient severity: 5


Dry Run:
Insert 5 → [5]
Insert 1 → [1,5]
Insert 3 → [1,5,3]
Poll → removes 1 → [3,5]
Poll → removes 3 → [5]
Poll → removes 5 → []
Always serves lowest number first (highest priority).
 */