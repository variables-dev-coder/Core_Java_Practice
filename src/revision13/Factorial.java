package revision13;

// Find Factorial (Using Recursion)

public class Factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " = " + factorial(num)); // Factorial of 5 = 120
    }
}


//Logic:
//n! = n * (n-1)! until n == 1.
//Concept: Recursion, function calling itself.