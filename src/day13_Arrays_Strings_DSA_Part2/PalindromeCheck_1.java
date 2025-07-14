package day13_Arrays_Strings_DSA_Part2;

public class PalindromeCheck_1 {
    public static void main(String[] args) {
        String str = "madam";    // LowerCase
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");    // Palindrome
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
