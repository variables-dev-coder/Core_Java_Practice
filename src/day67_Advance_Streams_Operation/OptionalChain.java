package day67_Advance_Streams_Operation;

// Functional style Optional usage

import java.util.*;

public class OptionalChain {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("munna");

        String upper = name.map(String::toUpperCase)
                .orElse("default");

        System.out.println(upper); // MUNNA
    }
}

