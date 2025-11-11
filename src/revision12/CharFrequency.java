package revision12;

import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println(freq);
    }
}

// {p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}