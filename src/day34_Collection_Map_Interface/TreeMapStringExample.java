package day34_Collection_Map_Interface;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapStringExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> wordCount = new TreeMap<>();

        wordCount.put("apple", 5);
        wordCount.put("banana", 2);
        wordCount.put("grape", 7);
        wordCount.put("orange", 3);
        wordCount.put("kiwi", 1);

        System.out.println("🍇 Word Count (Sorted by Word):");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // TreeMap-specific methods
        System.out.println("\nFirst Key: " + wordCount.firstKey());
        System.out.println("Last Key: " + wordCount.lastKey());

        System.out.println("\nWords from 'banana' to 'kiwi':");
        SortedMap<String, Integer> range = wordCount.subMap("banana", "kiwi");
        System.out.println(range);

        System.out.println("\nWords before 'grape':");
        SortedMap<String, Integer> beforeGrape = wordCount.headMap("grape");
        System.out.println(beforeGrape);

        System.out.println("\nWords from 'grape' onwards:");
        SortedMap<String, Integer> fromGrape = wordCount.tailMap("grape");
        System.out.println(fromGrape);
    }
}
