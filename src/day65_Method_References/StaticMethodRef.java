package day65_Method_References;

// Static Method Reference

import java.util.function.Function;

public class StaticMethodRef {
    public static void main(String[] args) {
        // Lambda version
        Function<String, Integer> lambdaParser = s -> Integer.parseInt(s);

        // Method Reference version
        Function<String, Integer> methodRefParser = Integer::parseInt;

        System.out.println("Lambda: " + lambdaParser.apply("100"));    // 100
        System.out.println("MethodRef: " + methodRefParser.apply("200")); // 200
    }
}

//Lambda: 100
//MethodRef: 200