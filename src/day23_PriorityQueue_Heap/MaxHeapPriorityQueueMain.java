package day23_PriorityQueue_Heap;




class MaxHeapPriorityQueue {
    private int[] heap;
    private int size;

    public MaxHeapPriorityQueue(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    public void offer(int value) {
        if (size == heap.length) throw new RuntimeException("Heap is full");
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    public int poll() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return root;
    }

    public int peek() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        return heap[0];
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap[index] > heap[parent]) {
                swap(index, parent);
                index = parent;
            } else break;
        }
    }

    private void heapifyDown(int index) {
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && heap[left] > heap[largest]) largest = left;
            if (right < size && heap[right] > heap[largest]) largest = right;

            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else break;
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

public class MaxHeapPriorityQueueMain {
    public static void main(String[] args) {
        MaxHeapPriorityQueue pq = new MaxHeapPriorityQueue(10);

        pq.offer(10);
        pq.offer(50);
        pq.offer(30);
        pq.offer(40);
        pq.offer(20);

        System.out.println("Peek: " + pq.peek()); // 50

        while (true) {
            try {
                System.out.println("Removed: " + pq.poll());
            } catch (RuntimeException e) {
                break;
            }
        }
    }
}

/*
Peek: 50
Removed: 50
Removed: 40
Removed: 30
Removed: 20
Removed: 10

 */