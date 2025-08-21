package day38_Collection_interface;

// Using Collections.max() and min()

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 8, 5, 12, 1);
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));
    }
}

//Max: 12
//Min: 1