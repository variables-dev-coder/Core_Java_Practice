package revision_8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("Task1");
        q.offer("Task2");
        q.offer("Task3");
        q.offer("Task4");
        q.offer("Task5");


        System.out.println("Queue: " + q);
        System.out.println("processing: " + q.poll());
        System.out.println("Next: " + q.peek());

        System.out.println("Queue: " + q);
    }
}

//Queue: [Task1, Task2, Task3, Task4, Task5]
//processing: Task1
//Next: Task2
//Queue: [Task2, Task3, Task4, Task5]