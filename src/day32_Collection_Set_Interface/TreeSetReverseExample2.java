package day32_Collection_Set_Interface;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetReverseExample2 {
    public static void main(String[] args) {
        // TreeSet with reverse comparator
        TreeSet<Integer> numbers = new TreeSet<>(Collections.reverseOrder());

        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("TreeSet with reverse order using Comparator:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


// 40 30 20 10