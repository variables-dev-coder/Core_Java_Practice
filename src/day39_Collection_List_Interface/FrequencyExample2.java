package day39_Collection_List_Interface;

import java.util.*;

public class FrequencyExample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple"
        ));

        // Use a Set to avoid duplicates
        Set<String> unique = new HashSet<>(list);

        for (String item : unique) {
            int freq = Collections.frequency(list, item);
            System.out.println(item + " -> " + freq);
        }
    }
}

/*
banana -> 2
orange -> 1
apple -> 3
 */