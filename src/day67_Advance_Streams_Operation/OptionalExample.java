package day67_Advance_Streams_Operation;

// Optional & Streams
// Using Optional as result of streams

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> names = List.of("munna", "aziz", "java");

        Optional<String> longest = names.stream()
                .max((a,b) -> Integer.compare(a.length(), b.length()));

        longest.ifPresent(System.out::println); // "munna"
    }
}

