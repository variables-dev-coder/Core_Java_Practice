package day12_Arrays_Strings_DSA;

public class SkipDivisibleBy2 {
    public static void main(String[] args) {
        int N = 12;

        for (int i = 1; i <= 12; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");   // 1 3 5 7 9 11
        }
    }
}


// If You Remove continue, What Happens?
// It will print all numbers from 1 to N, including those divisible by 2