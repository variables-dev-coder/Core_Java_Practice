package revision_2ArraysStringRecursion;


public class SumOfDigits {
    public static int sum(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sum(n / 10);
    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println("Sum of digits: " + sum(num));
    }
}

/*

Sum of Digits
Logic:
Base Case: If number == 0 → return 0
Recursive: return (n % 10) + sum(n / 10)
Dry Run:
For n = 123
123 → 3 + sum(12)
→ 3 + 2 + sum(1)
→ 3 + 2 + 1 + sum(0)
= 6

 */