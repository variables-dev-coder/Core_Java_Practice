package day66_Streams_API;


// 2. map() – Transforming Elements

import java.util.List;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = List.of("munna", "aziz");

        // Convert to uppercase
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(upper); // [MUNNA, AZIZ]

        // Map to lengths
        List<Integer> lengths = names.stream()
                .map(String::length)
                .toList();
        System.out.println(lengths); // [5, 4]
    }
}

//[MUNNA, AZIZ]
//[5, 4]