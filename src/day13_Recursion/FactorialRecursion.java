package day13_Recursion;

public class FactorialRecursion {
    static int factorial(int n) {
        if (n == 0) return 1;    // base case
        return  n * factorial(n-1);   // recursive step
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 : " + factorial(5));
    }
}
