package revision14;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        int l = 0, r = s.length() - 1;
        boolean isPal = true;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                isPal = false;
                break;
            }
            l++;
            r--;
        }

        System.out.println(isPal ? "Palindrome" : "Not Palindrome");   // Palindrome
    }
}
