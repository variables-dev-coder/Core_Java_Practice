package day43_Collection_PriorityQueue;

import java.util.PriorityQueue;


class Job implements Comparable<Job> {
    int id;
    int priority;

    Job(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    @Override
    public int compareTo(Job other) {
        return this.priority - other.priority; // min-heap (lower = higher priority)
    }

    @Override
    public String toString() {
        return "Job{id=" + id + ", priority=" + priority + "}";
    }
}

public class CustomObjectPQ {
    public static void main(String[] args) {
        PriorityQueue<Job> pq = new PriorityQueue<>();

        pq.add(new Job(1, 3));
        pq.add(new Job(2, 1));
        pq.add(new Job(3, 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

/*
Job{id=2, priority=1}
Job{id=3, priority=2}
Job{id=1, priority=3}

 */