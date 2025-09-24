package day64_Lambdas;

// Passing Lambda as Parameter

import java.util.function.Function;

public class LambdaAsParameter {
    public static void main(String[] args) {
        printResult(5, n -> n * n);
        printResult(7, n -> n + 10);
    }

    static void printResult(int num, Function<Integer, Integer> function) {
        System.out.println(function.apply(num));
    }
}
