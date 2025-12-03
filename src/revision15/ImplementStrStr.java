package revision15;

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m) return i; // found match
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));   // 2
        System.out.println(strStr("aaaaa", "bba"));  // -1
        System.out.println(strStr("abc", ""));       // 0
    }
}
