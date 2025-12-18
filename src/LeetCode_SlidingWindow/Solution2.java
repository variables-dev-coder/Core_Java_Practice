package LeetCode_SlidingWindow;

import java.util.*;

public class Solution2 {

    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        // First window
        for (int i = 0; i < 3; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (map.size() == 3) {
            count++;
        }

        // Slide window
        for (int i = 3; i < s.length(); i++) {
            // remove left char
            char left = s.charAt(i - 3);
            map.put(left, map.get(left) - 1);
            if (map.get(left) == 0) {
                map.remove(left);
            }

            // add right char
            char right = s.charAt(i);
            map.put(right, map.getOrDefault(right, 0) + 1);

            if (map.size() == 3) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        String s = "xyzzaz";
        int result = sol.countGoodSubstrings(s);

        System.out.println("Good substrings count = " + result);
    }
}

