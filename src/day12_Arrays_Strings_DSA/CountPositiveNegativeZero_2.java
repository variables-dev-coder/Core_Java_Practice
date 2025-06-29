package day12_Arrays_Strings_DSA;

public class CountPositiveNegativeZero_2 {
    public static void main(String[] args) {
        int[] arr = {12, 34, -89, 0, 0, 23, -1, -90, 67, 0, -78, -3};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {
            if (num > 0) positive++;
            else if (num < 0) negative++;
            else zero++;
        }
        System.out.println("Positive: " + positive + ", Negative: " + negative + ", Zero: " + zero);
    }
}
