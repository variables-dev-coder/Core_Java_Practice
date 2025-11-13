package revision13;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev))
            System.out.println(str + " is Palindrome");  // madam is Palindrome
        else
            System.out.println(str + " is not Palindrome");
    }
}


//Logic:
//Reverse the string → Compare with original.
//Concept: String comparison using .equals().