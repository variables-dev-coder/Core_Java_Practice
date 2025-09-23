package Day63_Functional_Programming_Basics;

//Remove Duplicates
//Remove duplicate numbers from a list using functional style.

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1, 4, 5, 6, 7, 4, 3, 1, 5, 6);

        List<Integer> result = numbers.stream()
                                      .distinct()
                                      .toList();

        System.out.println(result); // [1, 2, 3, 4, 5, 6, 7]
    }
}
