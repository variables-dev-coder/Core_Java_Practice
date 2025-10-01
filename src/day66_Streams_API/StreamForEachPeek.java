package day66_Streams_API;

// 7. forEach() vs peek()

import java.util.List;

public class StreamForEachPeek {
    public static void main(String[] args) {
        List<String> names = List.of("munna", "aziz", "java");

        // forEach → Terminal operation
        names.stream().forEach(System.out::println);

        // peek → Debugging intermediate
        List<String> upper = names.stream()
                .peek(n -> System.out.println("Original: " + n))
                .map(String::toUpperCase)
                .toList();

        System.out.println(upper);
    }
}


//munna
//aziz
//java
//Original: munna
//Original: aziz
//Original: java
//[MUNNA, AZIZ, JAVA]