package day23_PriorityQueue_Heap;


// PriorityQueue with Custom Objects

import java.util.PriorityQueue;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class CustomPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> b.marks - a.marks);  // Max - Heap

        pq.offer(new Student("Munna", 85));
        pq.offer(new Student("Aziz", 99));
        pq.offer(new Student("Zoyz", 89));

        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.name + ": " + s.marks);
        }
    }
}
