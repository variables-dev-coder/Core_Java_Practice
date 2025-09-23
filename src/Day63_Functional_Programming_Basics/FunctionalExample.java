package Day63_Functional_Programming_Basics;


// Functional Style (Focus on what to do)


import java.util.Arrays;
import java.util.List;

public class FunctionalExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)   // keep even numbers
                .map(n -> n * n)           // square them
                .toList();

        System.out.println(result); // [4, 16, 36]
    }
}


//Tells what to do (filter, map) instead of managing loops.
//Cleaner, more declarative.