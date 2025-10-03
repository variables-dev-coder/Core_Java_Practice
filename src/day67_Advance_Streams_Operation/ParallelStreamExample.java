package day67_Advance_Streams_Operation;

/*
Parallel Streams
When to use:
Good for CPU-intensive tasks with large data sets.
Not recommended for small lists (overhead cost) or I/O-bound tasks.
Be careful with shared mutable state → can cause race conditions.
 */


import java.util.*;
import java.util.stream.*;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> nums = IntStream.rangeClosed(1, 1000)
                .boxed()
                .toList();

        int sum = nums.parallelStream()
                .reduce(0, Integer::sum);

        System.out.println("Sum=" + sum);
    }
}

// Sum=500500