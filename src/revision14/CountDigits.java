package revision14;

public class CountDigits {
    public static void main(String[] args) {
        int num = 98721;
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println("Digits: " + count);  // Digits: 5
    }
}
