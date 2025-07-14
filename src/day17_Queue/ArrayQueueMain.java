package day17_Queue;

// Custom Queue using Array (Fixed Size)

class ArrayQueue {
    int[] arr;
    int front = 0;
    int rear = 0;
    int size = 0;
    int capacity = 0;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void enqueue(int val) {
        if (size == capacity) {
            System.out.println("Queue is null");
            return;
        }
        arr[rear] = val;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public int peek() {
        return (size == 0) ? -1 : arr[front];
    }

    public int getSize() {
        return size;
    }
}

public class ArrayQueueMain {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Front: " + q.peek());   // 10
        q.dequeue();

        System.out.println("Now Front: " + q.peek());  // 20
    }
}
