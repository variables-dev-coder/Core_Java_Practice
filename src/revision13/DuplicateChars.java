package revision13;

//Find Duplicate Characters in String

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

//r : 2
//g : 2
//m : 2

//Logic:
//Use HashMap to count frequency.
//Concept: HashMap, key-value pairs, frequency count.