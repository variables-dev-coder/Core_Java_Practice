package revision15;

public class CountPalindromicSubstrings {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println("Total palindromic substrings: " + countPalindromes(s));
    }

    public static int countPalindromes(String s) {
        int count = 0;
        int n = s.length();

        for (int center = 0; center < n; center++) {
            // Odd length palindromes
            count += expandFromCenter(s, center, center);
            // Even length palindromes
            count += expandFromCenter(s, center, center + 1);
        }

        return count;
    }

    private static int expandFromCenter(String s, int left, int right) {
        int cnt = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}

//Total palindromic substrings: 6