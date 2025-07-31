package day32_Collection_Set_Interface;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetReverseExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Getting a reverse view
        NavigableSet<Integer> reverse = numbers.descendingSet();

        System.out.println("Reverse order:");
        for (int num : reverse) {
            System.out.print(num + " ");
        }
    }
}

// 40 30 20 10