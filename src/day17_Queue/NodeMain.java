package day17_Queue;

// Custom Queue using LinkedList (Dynamic Size)

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedListQueue {
    Node front;
    Node rear;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }

    public int peek() {
        return (front == null) ? -1 : front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
public class NodeMain {
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Front: " + q.peek());

        q.dequeue();
        System.out.println("Now Front: " + q.peek());
    }
}
