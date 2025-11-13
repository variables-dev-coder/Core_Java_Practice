package revision13;

public class SumOfDigits {
    static int sumDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Sum of digits: " + sumDigits(n));   // Sum of digits: 15
    }
}

// Concept: Recursion, modulo %, division /.