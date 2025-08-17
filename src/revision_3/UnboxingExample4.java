package revision_3;

import java.util.ArrayList;

public class UnboxingExample4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing while adding
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        // Unboxing while retrieving
        int first = numbers.get(0);  // Integer → int
        int second = numbers.get(1);
        int sum = first + second;

        System.out.println("First Number: " + first);
        System.out.println("Second Number: " + second);
        System.out.println("Sum: " + sum);
    }
}

/*
Explanation:

While adding (numbers.add(100)), autoboxing happens (int → Integer).
While retrieving (int first = numbers.get(0)), unboxing happens (Integer → int).
Java automatically converts back and forth.

 */