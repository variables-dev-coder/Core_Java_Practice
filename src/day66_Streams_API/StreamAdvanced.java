package day66_Streams_API;

// 9. Advanced Example – Combine map + filter + sorted + collect

import java.util.List;

public class StreamAdvanced {
    public static void main(String[] args) {
        List<String> words = List.of("spring", "java", "stream", "boot", "api", "java");

        List<String> result = words.stream()
                .filter(w -> w.length() > 3)   // keep length > 3
                .map(String::toUpperCase)      // uppercase
                .distinct()                    // remove duplicates
                .sorted()                      // sort
                .toList();

        System.out.println(result); // [BOOT, JAVA, SPRING, STREAM]
    }
}
