package revision_2ArraysStringRecursion;


// Count Digits
//Logic:
//Base Case: if n == 0 → return 0
//Recursive: return 1 + count(n / 10)

public class CountDigits {
    public static int count(int n) {
        if (n == 0) return 0;
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        int num = 54321;
        System.out.println("Digits Count: " + count(num));
    }
}
