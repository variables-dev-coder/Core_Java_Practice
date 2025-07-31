package day32_Collection_Set_Interface;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(5); // duplicate - will be ignored

        System.out.println("TreeSet Elements (Sorted): " + numbers);

        // First and last element
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        // Remove element
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);

        // Contains check
        System.out.println("Contains 15? " + numbers.contains(15));

        // HeadSet and TailSet
        System.out.println("HeadSet(15): " + numbers.headSet(15));
        System.out.println("TailSet(15): " + numbers.tailSet(15));

    }
}

/*
TreeSet Elements (Sorted): [5, 10, 15, 20]
First: 5
Last: 20
After removing 10: [5, 15, 20]
Contains 15? true
HeadSet(15): [5]
TailSet(15): [15, 20]

 */