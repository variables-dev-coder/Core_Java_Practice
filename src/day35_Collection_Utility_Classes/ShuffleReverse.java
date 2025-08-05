package day35_Collection_Utility_Classes;


// Shuffle and Reverse a List

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleReverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }
}
