package day68_Functional_Enhancements_Beyond_Streams;


// forEach() on Collections

import java.util.List;

public class forEachExample {
    public static void main(String[] args) {
        List<String> names = List.of("java", "spring", "boot");
        names.forEach(System.out::println);  // java spring boot
    }
}
