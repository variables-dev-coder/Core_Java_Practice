package day13_Arrays_Strings_DSA_Part2;

public class PalindromeCheck_2 {
    public static void main(String[] args) {
        String str = "Madam";   // Uper and lowercase
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");  // Not Palindrome
        }
    }
}


/*

You're checking str.equals(rev), but:

Original string is "Madam" (with capital M)

Reversed string is "madaM" (lowercase start, capital end)

So equals() fails because it is case-sensitive


 */