package day67_Advance_Streams_Operation;

// Min, Max, Sum with reduce()

import java.util.*;

public class ReduceAdvanced {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10,20,5,8,30);

        int max = nums.stream().reduce(Integer.MIN_VALUE, Integer::max);
        int min = nums.stream().reduce(Integer.MAX_VALUE, Integer::min);
        int sum = nums.stream().reduce(0, Integer::sum);

        System.out.println("Max=" + max + " Min=" + min + " Sum=" + sum);
    }
}

// Max=30 Min=5 Sum=73