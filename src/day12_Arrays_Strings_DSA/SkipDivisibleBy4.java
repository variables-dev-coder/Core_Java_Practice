package day12_Arrays_Strings_DSA;

public class SkipDivisibleBy4 {
    public static void main(String[] args) {
        int N = 25;

        for (int i = 1; i <= 25; i++) {
            if (i % 4 == 0) {
                continue;    // skip this iteration
            }
            System.out.println(i + " ");
        }
    }
}
