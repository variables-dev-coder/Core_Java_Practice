package revision15;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0, start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}

// Length: 3