package day67_Advance_Streams_Operation;


// Counting, Summing, Averaging

import java.util.*;
import static java.util.stream.Collectors.*;

public class AggregationExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);

        long count = nums.stream().collect(counting());
        int sum = nums.stream().collect(summingInt(n -> n));
        double avg = nums.stream().collect(averagingInt(n -> n));

        System.out.println("Count=" + count + ", Sum=" + sum + ", Avg=" + avg);
    }
}

// Count=5, Sum=15, Avg=3.0