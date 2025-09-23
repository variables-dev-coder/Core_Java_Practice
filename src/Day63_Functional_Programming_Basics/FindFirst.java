package Day63_Functional_Programming_Basics;


//Find First Element
//Find the first element greater than 10 from a list.


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 12, 15, 2);

        Optional<Integer> first = numbers.stream()
                .filter(n -> n > 10)
                .findFirst();

        System.out.println(first.orElse(-1));
    }
}
