package day39_Collection_List_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Using Collections.reverse()
        Collections.reverse(numbers);

        System.out.println("Reversed List: " + numbers);
    }
}

/*
Original List: [10, 20, 30, 40, 50]
Reversed List: [50, 40, 30, 20, 10]

Logic:

Collections.reverse(list) → directly reverses the list in-place.
Time complexity → O(n) since it swaps elements pairwise.
This is an efficient and built-in way to reverse an ArrayList.

 */