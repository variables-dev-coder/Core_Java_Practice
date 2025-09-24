package day64_Lambdas;

// Function Chaining (andThen, compose)

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply = x -> x * 2;
        Function<Integer, Integer> add = x -> x + 3;

        System.out.println(multiply.andThen(add).apply(5)); // (5*2)+3 = 13
        System.out.println(multiply.compose(add).apply(5)); // (5+3)*2 = 16
    }
}
