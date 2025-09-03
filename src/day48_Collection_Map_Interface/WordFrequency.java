package day48_Collection_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java is great and java is powerful";

        // HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Split the text into words
        String[] words = text.split(" ");

        for (String word : words) {
            // putIfAbsent initializes with 0, then add 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the frequency map
        System.out.println("Word Frequency: " + wordCount);

        // Iterating properly
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

/*
Logic:
Split the string into words.
Traverse each word.
Use HashMap → Key = word, Value = count.
If word exists → increment count.
If not → put count = 1.


Word Frequency: {java=2, is=2, great=1, and=1, powerful=1}
java → 2
is → 2
great → 1
and → 1
powerful → 1

 */