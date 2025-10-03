package day67_Advance_Streams_Operation;


/*
Primitive Streams (Avoids Boxing Overhead)
IntStream, LongStream, DoubleStream → more efficient.
 */

import java.util.stream.*;

public class PrimitiveStreams {
    public static void main(String[] args) {
        // IntStream range
        int sum = IntStream.rangeClosed(1, 5).sum();
        System.out.println("Sum=" + sum); // 15

        // Average
        double avg = IntStream.of(10,20,30).average().getAsDouble();
        System.out.println("Avg=" + avg); // 20.0

        // Max
        int max = IntStream.of(5, 9, 2, 12).max().getAsInt();
        System.out.println("Max=" + max); // 12
    }
}

/*
Mastery Checklist (Day 5)

groupingBy, partitioningBy
Aggregators → counting, summing, averaging
Reduction with reduce() → min, max, sum
Optional API → functional chaining, safety
Parallel streams → use cases & pitfalls
Primitive streams → efficiency

 */