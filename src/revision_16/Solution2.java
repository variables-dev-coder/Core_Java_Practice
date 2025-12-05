package revision_16;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            // Duplicate found → shrink window
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add character and expand window
            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);

            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // 3
    }
}
