package revision15;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "hello";

        System.out.println(s1 + " -> " + isPalindrome(s1));
        System.out.println(s2 + " -> " + isPalindrome(s2));
    }
}

//madam -> true
//hello -> false