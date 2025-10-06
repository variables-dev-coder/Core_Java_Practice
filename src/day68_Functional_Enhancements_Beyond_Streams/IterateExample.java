package day68_Functional_Enhancements_Beyond_Streams;

//1.3 Stream.iterate() (Enhanced in Java 9)
//Supports a condition, avoiding infinite loops.

import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n <= 10, n -> n + 2)
                .forEach(System.out::println);  // 1 3 5 7 9
    }
}
