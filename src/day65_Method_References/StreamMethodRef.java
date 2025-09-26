package day65_Method_References;

// Real-World Example with Streams

import java.util.Arrays;
import java.util.List;

public class StreamMethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("munna", "aziz", "java", "functional");

        // Convert to uppercase and print using method references
        names.stream()
                .map(String::toUpperCase)   // instead of (s -> s.toUpperCase())
                .forEach(System.out::println); // instead of (s -> System.out.println(s))
    }
}

//MUNNA
//AZIZ
//JAVA
//FUNCTIONAL