package revision15;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean result = isAnagram(s1, s2);
        System.out.println(result ? "Anagram" : "Not Anagram");
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int n : freq) {
            if (n != 0) return false;
        }
        return true;
    }
}


// Anagram