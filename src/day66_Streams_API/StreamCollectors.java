package day66_Streams_API;


// 8. Collectors – Collecting Results

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamCollectors {
    public static void main(String[] args) {
        List<String> names = List.of("munna", "aziz", "java");

        // To List
        List<String> list = names.stream().collect(toList());
        System.out.println(list);

        // To Set
        Set<String> set = names.stream().collect(toSet());
        System.out.println(set);

        // To Map (name → length)
        Map<String, Integer> map = names.stream()
                .collect(toMap(s -> s, s -> s.length()));
        System.out.println(map); // {munna=5, aziz=4, java=4}
    }
}

//[munna, aziz, java]
//[java, aziz, munna]
//{java=4, aziz=4, munna=5}