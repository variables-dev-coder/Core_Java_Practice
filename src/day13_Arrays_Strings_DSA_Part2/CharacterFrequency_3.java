package day13_Arrays_Strings_DSA_Part2;


// Write a program to count how many times each character appears in a string.

import java.util.HashMap;

public class CharacterFrequency_3 {
    public static void main(String[] args) {
        String input = "acdaefradessb";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch == ' ') continue;   // skip space

            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (char key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key) + " time(s)");
        }
    }
}
