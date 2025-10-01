package day66_Streams_API;

// 4. flatMap() – Flatten Nested Collections

import java.util.List;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nested = List.of(
                List.of("a", "b"),
                List.of("c", "d")
        );

        List<String> flat = nested.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flat); // [a, b, c, d]
    }
}
