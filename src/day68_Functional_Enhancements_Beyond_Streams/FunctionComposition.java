package day68_Functional_Enhancements_Beyond_Streams;


//Functional Composition
//Functional interfaces can chain operations.
//andThen() → Executes second after first
//compose() → Executes first after second


import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = n -> n * 2;
        Function<Integer, Integer> squareIt = n -> n * n;

        Function<Integer, Integer> result1 = doubleIt.andThen(squareIt);  // (x*2)^2
        Function<Integer, Integer> result2 = doubleIt.compose(squareIt);  // (x^2)*2

        System.out.println(result1.apply(3));  // 36
        System.out.println(result2.apply(3));  // 18
    }
}
