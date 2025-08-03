package revision_2ArraysStringRecursion;



// Palindrome Check
//A string is a palindrome if it reads the same forward and backward.
//Logic:
//Compare characters from both ends moving inward.

public class PalindromeCheck {
    public static void main(String[] args) {

        String str = "madam";
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}

/*
Input: "madam"
start=0, end=4 → m == m
start=1, end=3 → a == a
start=2, end=2 → Done → Palindrome
 */