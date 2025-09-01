package day45_Collection_Set_Interface_Class;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetNaturalOrder {
    public static void main(String[] args) {
        // Integers have natural ordering (1, 2, 3...)
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(1);
        System.out.println("Sorted Numbers: " + numbers); // [1, 5, 10, 20]
    }
}

//Sorted Numbers: [1, 5, 10, 20]