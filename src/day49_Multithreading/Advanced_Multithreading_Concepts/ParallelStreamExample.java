package day49_Multithreading.Advanced_Multithreading_Concepts;


/*
Parallel Streams (Java 8)
Concept:
Streams API can run in parallel with .parallelStream() or .parallel().
Uses ForkJoinPool under the hood.
Easy syntax but beware of race conditions if using shared mutable state.
Example:

 */

import java.util.*;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sum = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum = " + sum);
    }
}

/*
sum = 45

Dry Run:

Data split into multiple chunks.
Each chunk processed by different threads.
Final results reduced into single sum.

 */