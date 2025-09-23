package Day63_Functional_Programming_Basics;


//Sum of List
//Find the sum of all numbers in a list using functional programming.

import java.util.Arrays;
import java.util.List;

public class SumExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);  // 21
    }
}
