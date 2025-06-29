package day12_Arrays_Strings_DSA;

public class SkipDivisibleBy3 {
    public static void main(String[] args) {
        int N = 10;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                continue;     // skip this iteration
            }
            System.out.println(i + " ");
        }
    }
}
