package revision15;

import java.util.HashMap;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "banana";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

//a -> 3
//b -> 1
//n -> 2