package revision_3;

import java.util.ArrayList;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing: int → Integer (when adding into collection)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);   // int automatically converted to Integer
        numbers.add(10);  // int → Integer

        // Unboxing: Integer → int (when retrieving)
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;   // Integer automatically converted to int
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
    }
}

/*
Numbers: [5, 10]
Sum: 15


Autoboxing happens automatically when adding primitive int into ArrayList<Integer>.
Unboxing happens automatically when retrieving Integer and using it in arithmetic.
 */