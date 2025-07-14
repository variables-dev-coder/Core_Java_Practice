package day16_Recursion;

public class RecursionPrint {
    static void printDescending(int n) {
        if (n == 0) return;  // base case
        System.out.println(n);
        printDescending(n-1);   // recursive call
    }

    public static void main(String[] args) {
        printDescending(5);
    }
}
