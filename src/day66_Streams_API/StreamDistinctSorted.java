package day66_Streams_API;

// 5. distinct(), sorted()

import java.util.List;

public class StreamDistinctSorted {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 3, 2, 2, 1, 5);

        List<Integer> result = nums.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(result); // [1,2,3,5]
    }
}
