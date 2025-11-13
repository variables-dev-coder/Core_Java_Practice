package revision13;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String str = "aabbcddeff";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeated: " + c);
                break;
            }
        }
    }
}

//Logic:
//Use LinkedHashMap to maintain order and count frequencies.
//Concept: LinkedHashMap, frequency counting.