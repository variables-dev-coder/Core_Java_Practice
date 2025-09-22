package day62_Generics_Class_Method;

//Generic MaxHeap

import java.util.*;

class MaxHeap<T extends Comparable<T>> {
    private List<T> heap = new ArrayList<>();

    public void insert(T value) {
        heap.add(value);
        int i = heap.size() - 1;
        // Bubble up
        while (i > 0 && heap.get(i).compareTo(heap.get((i - 1) / 2)) > 0) {
            Collections.swap(heap, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public T extractMax() {
        if (heap.isEmpty()) return null;
        T max = heap.get(0);
        T last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0);
        }
        return max;
    }

    private void heapify(int i) {
        int left = 2 * i + 1, right = 2 * i + 2, largest = i;

        if (left < heap.size() && heap.get(left).compareTo(heap.get(largest)) > 0)
            largest = left;

        if (right < heap.size() && heap.get(right).compareTo(heap.get(largest)) > 0)
            largest = right;

        if (largest != i) {
            Collections.swap(heap, i, largest);
            heapify(largest);
        }
    }

    public void printHeap() {
        System.out.println(heap);
    }
}

public class MainHeap {
    public static void main(String[] args) {
        MaxHeap<Integer> intHeap = new MaxHeap<>();
        intHeap.insert(10);
        intHeap.insert(40);
        intHeap.insert(30);
        intHeap.insert(50);
        intHeap.insert(20);

        intHeap.printHeap(); // Heap structure

        System.out.println("Extract Max: " + intHeap.extractMax());
        intHeap.printHeap();

        MaxHeap<String> strHeap = new MaxHeap<>();
        strHeap.insert("Banana");
        strHeap.insert("Apple");
        strHeap.insert("Mango");
        strHeap.insert("Cherry");

        strHeap.printHeap();
        System.out.println("Extract Max: " + strHeap.extractMax());
        strHeap.printHeap();
    }
}

//[50, 40, 30, 10, 20]
//Extract Max: 50
//[40, 20, 30, 10]
//[Mango, Cherry, Banana, Apple]
//Extract Max: Mango
//[Cherry, Apple, Banana]