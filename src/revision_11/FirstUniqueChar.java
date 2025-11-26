package revision_11;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static char firstUnique(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : s.toCharArray())
            if (map.get(c) == 1)
                return c;

        return '_';  // if none found
    }

    public static void main(String[] args) {
        System.out.println(firstUnique("swiss"));
    }
}
