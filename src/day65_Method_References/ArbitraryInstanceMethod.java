package day65_Method_References;

// Instance Method Reference (arbitrary object of a particular type)

import java.util.Arrays;
import java.util.List;

public class ArbitraryInstanceMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Munna", "Aziz", "Java", "Lambda");

        // Sort using method reference
        names.sort(String::compareToIgnoreCase);

        // Print using method reference
        names.forEach(System.out::println);
    }
}

// Cleaner than (s1, s2) -> s1.compareToIgnoreCase(s2)

//Aziz
//Java
//Lambda
//Munna
