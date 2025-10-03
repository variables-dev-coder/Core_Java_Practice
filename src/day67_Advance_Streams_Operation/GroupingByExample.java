package day67_Advance_Streams_Operation;


//1. Collectors (Part 2)
//groupingBy() – Group elements into a Map<K, List<V>>

import java.util.*;
import static java.util.stream.Collectors.*;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> words = List.of("java", "spring", "boot", "stream", "spring", "java");

        Map<String, Long> freq = words.stream()
                .collect(groupingBy(w -> w, counting()));

        System.out.println(freq); // {boot=1, stream=1, spring=2, java=2}
    }
}

// {spring=2, java=2, stream=1, boot=1}