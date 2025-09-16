package day49_Multithreading.Advanced_Multithreading_Concepts;

/*
1. Fork/Join Framework
Concept:
Introduced in Java 7 for divide and conquer parallelism.
Used when a task can be broken into smaller subtasks (recursively).
Uses ForkJoinPool.
Subtasks (RecursiveTask or RecursiveAction) are distributed across worker threads.
Example: Sum of array using Fork/Join

 */

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class ArraySumTask extends RecursiveTask<Long> {
    private int[] arr;
    private int start, end;
    private static final int THRESHOLD = 3;  // limit for splitting

    ArraySumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if ((end - start) <= THRESHOLD) {  // small enough
            long sum = 0;
            for (int i = start; i < end; i++) sum += arr[i];
            return sum;
        } else {
            int mid = (start + end) / 2;
            ArraySumTask left = new ArraySumTask(arr, start, mid);
            ArraySumTask right = new ArraySumTask(arr, mid, end);

            left.fork();  // run asynchronously
            long rightResult = right.compute(); // run current thread
            long leftResult = left.join(); // wait for left

            return leftResult + rightResult;
        }
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        ForkJoinPool pool = new ForkJoinPool();
        long result = pool.invoke(new ArraySumTask(arr, 0, arr.length));
        System.out.println("Array Sum = " + result);
    }

}

/*
Array Sum = 45

Dry Run:

Array split until chunks ≤ 3.
Subtasks executed in parallel.
Results combined.

 */