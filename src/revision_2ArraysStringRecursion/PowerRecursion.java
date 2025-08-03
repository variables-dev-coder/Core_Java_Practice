package revision_2ArraysStringRecursion;


// Power of a Number
//Find a^b using recursion.
//Logic:
//Base Case: b == 0 → return 1
//Recursive: return a * power(a, b - 1)

public class PowerRecursion {
    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println(a + "^" + b + " = " + power(a, b));
    }
}
