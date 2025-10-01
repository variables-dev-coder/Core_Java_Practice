package day66_Streams_API;

// 1. Stream creation

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasics {
    public static void main(String[] args) {
        // From Collection
        List<String> names = Arrays.asList("munna", "aziz", "java");
        names.stream().forEach(System.out::println);

        // From Array
        String[] arr = {"a", "b", "c"};
        Arrays.stream(arr).forEach(System.out::println);

        // Stream.of()
        Stream.of(10, 20, 30).forEach(System.out::println);
    }
}

//munna
//aziz
//java
//a
//b
//c
//10
//20
//30