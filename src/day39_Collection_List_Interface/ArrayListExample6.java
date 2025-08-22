package day39_Collection_List_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending: " + numbers);
    }
}

/*
Original List: [50, 20, 40, 10, 30]
Ascending: [10, 20, 30, 40, 50]
Descending: [50, 40, 30, 20, 10]

 */