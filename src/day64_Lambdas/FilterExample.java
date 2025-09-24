package day64_Lambdas;

// Filtering with Predicate

import java.util.*;
import java.util.function.Predicate;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        Predicate<Integer> greaterThan10 = n -> n > 10;

        numbers.stream()
                .filter(greaterThan10)
                .forEach(System.out::println); // 15, 20, 25
    }
}
