package revision_11;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void countChars(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static void main(String[] args) {
        countChars("banana");
    }
}
//a: 3
//b: 1
//n: 2