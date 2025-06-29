package day12_Arrays_Strings_DSA;

public class CountPositiveNegativeZero_3 {
    public static void main(String[] args) {
        int[] arr = {-10, 0, 48, -23, 45, 0, 65, -56, 0, 43, -100, 0};
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int num : arr) {
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;
        }
        System.out.println("Positive Number: " + pos + ", Negative Number: " + neg + ", Zero Number: " + zero);
    }
}
