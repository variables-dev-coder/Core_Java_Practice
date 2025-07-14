package day16_Binary_Heap_Implementation;

import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int getLeftChild(int i) { return 2 * i + 1; }
    private int getRightChild(int i) { return 2 * i + 2; }
    private int getParent(int i) { return (i - 1) / 2; }

    private boolean hasLeftChild(int i) { return getLeftChild(i) < size; }
    private boolean hasRightChild(int i) { return getRightChild(i) < size; }
    private boolean hasParent(int i) { return getParent(i) >= 0; }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    public void insert(int value) {
        if (size == capacity) throw new IllegalStateException("Heap is full");
        heap[size] = value;
        size++;
        heapifyUp();
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        return heap[0];
    }

    public int remove() {
        if (size == 0) throw new IllegalStateException("Heap is empty");

        int val = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return val;
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && heap[getParent(index)] < heap[index]) {
            swap(index, getParent(index));
            index = getParent(index);
        }
    }

    private void heapifyDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int largerChildIndex = getLeftChild(index);

            if (hasRightChild(index) && heap[getRightChild(index)] > heap[largerChildIndex]) {
                largerChildIndex = getRightChild(index);
            }

            if (heap[index] >= heap[largerChildIndex]) break;

            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    public void printHeap() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);
        heap.insert(40);

        heap.printHeap();                         // Output: [40, 30, 15, 10, 20]
        System.out.println("Max: " + heap.peek()); // 40
        System.out.println("Remove: " + heap.remove()); // Remove 40
        heap.printHeap(); // [30, 20, 15, 10]
    }
}
