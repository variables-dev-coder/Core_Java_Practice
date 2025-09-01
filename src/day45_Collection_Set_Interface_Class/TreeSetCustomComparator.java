package day45_Collection_Set_Interface_Class;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCustomComparator {
    public static void main(String[] args) {
        // Create a Comparator that compares String lengths
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        // Pass the comparator to the TreeSet constructor
        Set<String> words = new TreeSet<>(lengthComparator);
        // Can also be written with a Lambda:
        // Set<String> words = new TreeSet<>((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        words.add("Apple");
        words.add("Banana");
        words.add("Fig");
        words.add("Cherry");
        words.add("Kiwi"); // Same length as "Fig", so it's considered a duplicate and won't be added!

        System.out.println("Sorted by length: " + words);
        // Output: [Fig, Kiwi, Apple, Banana, Cherry]
        // Note: "Kiwi" was not added because "Fig" has the same length (3).
        // The Comparator determines equality for a TreeSet, not just equals().
    }
}
