package day64_Lambdas;

// Combining Predicate (and, or, negate)

import java.util.function.Predicate;

public class PredicateCombining {
    public static void main(String[] args) {
        Predicate<Integer> greaterThan5 = n -> n > 5;
        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(greaterThan5.and(even).test(10)); // true
        System.out.println(greaterThan5.and(even).test(3));  // false
        System.out.println(greaterThan5.or(even).test(4));   // true
        System.out.println(greaterThan5.negate().test(3));   // true
    }
}
