package revision12;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, original = num, reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println(original + " is palindrome: " + (original == reversed));
    }
}

// 121 is palindrome: true