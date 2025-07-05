package day12_Arrays_Strings_DSA_Part2;

import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapST.containsKey(ch1)) {
                if (mapST.get(ch1) != ch2) return false;
            } else {
                mapST.put(ch1, ch2);
            }

            if (mapTS.containsKey(ch2)) {
                if (mapTS.get(ch2) != ch1) return false;
            } else {
                mapTS.put(ch2, ch1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));   // true
        System.out.println(isIsomorphic("foo", "bar"));   // false

    }
}
