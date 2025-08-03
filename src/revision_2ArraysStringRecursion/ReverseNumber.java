package revision_2ArraysStringRecursion;

//Reverse a Number
//Logic:
//Use helper function with accumulator (or use rev * 10 + digit)

public class ReverseNumber {
    public static int reverse(int n, int rev) {
        if (n == 0)
            return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        int result = reverse(num, 0);
        System.out.println("Reversed: " + result);
    }
}
