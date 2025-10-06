package day68_Functional_Enhancements_Beyond_Streams;

//1.2 dropWhile()
//Skips elements while predicate is true.

import java.util.List;

public class DropWhileExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 1, 2);

        nums.stream()
                .dropWhile(n -> n < 4)
                .forEach(System.out::println);  // 4 5 6 1 2
    }
}
