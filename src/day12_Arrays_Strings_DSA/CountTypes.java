package day12_Arrays_Strings_DSA;

public class CountTypes {
    public static void main(String[] args) {
        int[] arr = {5, -6, 7, 0, 0, 7, -4,3, 0, -12};
        int positive =0;
        int negative = 0;
        int zero = 0;

        for (int num : arr) {
            if (num > 0) positive++;
            else if (num < 0) negative++;
            else zero++;
        }
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
