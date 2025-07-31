package day32_Collection_Set_Interface;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetAdvancedMethods {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(15, 10, 25, 30, 5, 20));

        System.out.println("TreeSet: " + numbers);

        System.out.println("Higher than 15: " + numbers.higher(15));   // > 15
        System.out.println("Lower than 15: " + numbers.lower(15));     // < 15

        System.out.println("Poll First (removes): " + numbers.pollFirst());
        System.out.println("Poll Last (removes): " + numbers.pollLast());

        System.out.println("After pollFirst & pollLast: " + numbers);

        System.out.println("Descending Set: " + numbers.descendingSet());
    }
}

/*
TreeSet: [5, 10, 15, 20, 25, 30]
Higher than 15: 20
Lower than 15: 10
Poll First (removes): 5
Poll Last (removes): 30
After pollFirst & pollLast: [10, 15, 20, 25]
Descending Set: [25, 20, 15, 10]

 */