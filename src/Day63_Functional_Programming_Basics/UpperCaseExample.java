package Day63_Functional_Programming_Basics;

import java.util.Arrays;
import java.util.List;

public class UpperCaseExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("munna", "aziz", "java developer");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);
    }
}

// [MUNNA, AZIZ, JAVA DEVELOPER]