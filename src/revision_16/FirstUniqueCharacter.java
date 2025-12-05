package revision_16;

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Find first index with freq 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;  // No unique character
    }

    public static void main(String[] args) {
        String s = "leetcode";

        int index = firstUniqChar(s);
        System.out.println("Input: " + s);
        System.out.println("First unique character index = " + index);
    }
}

//Input: leetcode
//First unique character index = 0