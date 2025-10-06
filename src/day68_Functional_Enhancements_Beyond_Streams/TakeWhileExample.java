package day68_Functional_Enhancements_Beyond_Streams;


//1.1 takeWhile()
//Takes elements until the predicate fails

import java.util.List;

public class TakeWhileExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 1, 2);

        nums.stream()
                .takeWhile(n -> n < 4)
                .forEach(System.out::println); // 1 2 3
    }
}
