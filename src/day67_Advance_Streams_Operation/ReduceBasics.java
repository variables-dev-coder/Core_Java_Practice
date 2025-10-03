package day67_Advance_Streams_Operation;


// Reduce (Reduction Operations)
//reduce() basics

import java.util.*;

public class ReduceBasics {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);

        int sum = nums.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.println("Sum = " + sum); // 15
    }
}

