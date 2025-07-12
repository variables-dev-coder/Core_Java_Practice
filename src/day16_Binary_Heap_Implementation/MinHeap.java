package day16_Binary_Heap_Implementation;

import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int getLeftChild(int i) {
        return 2 * i + 1;
    }

    private int getRightChild(int i) {
        return 2 * i + 2;
    }

    private int getParent(int i) {
        return (i - 1) / 2;
    }

    private boolean hasLeftChild(int i) {
        return getLeftChild(i) < size;
    }

    private boolean hasRightChild(int i) {
        return getRightChild(i) < size;
    }

    private boolean hasParent(int i) {
        return getParent(i) >= 0;
    }

    private void swap(int i, int j) {
        
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int value) {
        if (size == capacity) throw new IllegalStateException("Heap full");

        heap[size] = value;
        size++;
        heapifyUp();
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException("Heap empty");
        return heap[0];
    }

    public int remove() {
        if (size == 0) throw new IllegalStateException("Heap empty");

        int val = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return val;
    }

    private void heapifyUp() {
        int index = size - 1;

        while (hasParent(index) && heap[getParent(index)] > heap[index]) {
            swap(index, getParent(index));
            index = getParent(index);
        }
    }

    private void heapifyDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChild(index);

            if (hasRightChild(index) && heap[getRightChild(index)] < heap[smallerChildIndex]) {
                smallerChildIndex = getRightChild(index);
            }

            if (heap[index] <= heap[smallerChildIndex]) break;

            swap(index, smallerChildIndex);
            index = smallerChildIndex;
        }
    }

    public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(2);
        heap.insert(8);

        heap.printHeap();                                 // Output: [2, 5, 3, 10, 8]
        System.out.println("Peek: " + heap.peek());      // 2
        System.out.println("Remove: " + heap.remove()); // 2
        heap.printHeap();                              // Output after removing root
    }
}
