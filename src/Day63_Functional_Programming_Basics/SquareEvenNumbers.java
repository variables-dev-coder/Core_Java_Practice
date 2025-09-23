package Day63_Functional_Programming_Basics;


//Square of Even Numbers
//Write a program to print the squares of even numbers from a list.
//Functional Style


import java.util.Arrays;
import java.util.List;

public class SquareEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
        System.out.println(result);
    }
}
