package day66_Streams_API;

// 3. filter() – Keeping Elements

import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // Even numbers
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evens); // [2,4,6]
    }
}
