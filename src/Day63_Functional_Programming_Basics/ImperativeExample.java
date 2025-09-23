package Day63_Functional_Programming_Basics;

//Imperative vs Functional Style
//Example: Find the square of even numbers in a list
//Imperative Style (Step-by-step, how to do it)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (n % 2 == 0) {
                result.add(n * n);
            }
        }

        System.out.println(result); // [4, 16, 36]
    }
}

//Tells how to do it step by step (loop, condition, add to list).
//More boilerplate code.