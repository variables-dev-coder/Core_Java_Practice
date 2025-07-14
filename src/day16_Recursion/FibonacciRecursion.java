package day16_Recursion;

public class FibonacciRecursion {

    static int fibonacci(int n) {
        if (n == 0) return 0;       // base case 1
        if (n == 1) return 1;       // base case 2
        return fibonacci(n - 1) + fibonacci(n - 2);    // Recursive Case
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci number at position: " + n + " is: " + fibonacci(n));
    }
}
