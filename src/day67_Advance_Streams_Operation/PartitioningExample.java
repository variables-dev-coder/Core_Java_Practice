package day67_Advance_Streams_Operation;

// partitioningBy() – Split into true/false groups

import java.util.*;
import static java.util.stream.Collectors.*;

public class PartitioningExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 10, 15, 20, 25);

        Map<Boolean, List<Integer>> partition = nums.stream()
                .collect(partitioningBy(n -> n % 2 == 0));

        System.out.println(partition);
        // {false=[5,15,25], true=[10,20]}
    }
}

