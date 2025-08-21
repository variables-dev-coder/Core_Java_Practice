package day38_Collection_interface;

// Question: Show how you can add elements to a Collection and then sort it using Collections.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);

        // Collections works on List, so cast
        List<Integer> list = new ArrayList<>(numbers);

        Collections.sort(list); // Using Collections utility class
        System.out.println("Sorted list: " + list);
    }
}

// Sorted list: [1, 3, 5]