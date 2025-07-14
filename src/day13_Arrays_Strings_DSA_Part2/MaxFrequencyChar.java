package day13_Arrays_Strings_DSA_Part2;

import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyChar {
    public static void main(String[] args) {
        String str = "xyzxyzy";

        char maxChar = ' ';
        int maxCount = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Character with highest Frequency: " + maxChar + " (appears " + maxCount + " times)");
    }
}
