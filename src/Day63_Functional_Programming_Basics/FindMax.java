package Day63_Functional_Programming_Basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 45, 60);

        Optional<Integer> max = numbers.stream()
                                       .max(Integer::compareTo);

        System.out.println(max.orElse(-1)); // 60
    }
}
