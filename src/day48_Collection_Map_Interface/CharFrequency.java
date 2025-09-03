package day48_Collection_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String text = "programming";

        Map<Character, Integer> freqMap = new HashMap<>();

        // Count character frequency
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Print result
        System.out.println("Character Frequency: " + freqMap);

        // Iterating properly
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

/*
Logic:
Traverse each character in the string.
Skip spaces if needed.
Use HashMap<Character, Integer> → Key = character, Value = count.
Update frequency as you scan.


Character Frequency: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
p → 1
r → 2
o → 1
g → 2
a → 1
m → 2
i → 1
n → 1



 */