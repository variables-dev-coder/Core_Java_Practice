package revision_8;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency2 {
    public static void main(String[] args) {
        String str = "java is a fun";

        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println(freq);
    }
}

//{ =3, a=3, s=1, u=1, v=1, f=1, i=1, j=1, n=1}