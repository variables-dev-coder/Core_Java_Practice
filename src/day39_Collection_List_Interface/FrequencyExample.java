package day39_Collection_List_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyExample {
    public static void main(String[] args) {
        // Sample ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("apple");

        // Map to store frequency
        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        // Print frequencies
        System.out.println("Element Frequencies:");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

/*
Element Frequencies:
orange -> 1
banana -> 2
apple -> 3


 */