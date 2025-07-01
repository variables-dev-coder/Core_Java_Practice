package day12_Arrays_Strings_DSA;

public class FindMaxMin_1 {
    public static void main(String[] args) {
        int[] arr = {30, 12, 89, 24, 77};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i ]< min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
