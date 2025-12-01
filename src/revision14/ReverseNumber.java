package revision14;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345, rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse: " + rev);   // Reverse: 54321
    }
}
