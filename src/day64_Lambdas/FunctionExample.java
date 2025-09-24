package day64_Lambdas;

// Function (String Length)

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();
        System.out.println(length.apply("Munna")); // 5
    }
}
