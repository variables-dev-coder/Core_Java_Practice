package day13_Arrays_Strings_DSA_Part2;

public class PalindromeCheck_3 {
    public static void main(String[] args) {
        String str = "Madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
