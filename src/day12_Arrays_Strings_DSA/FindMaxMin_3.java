package day12_Arrays_Strings_DSA;

public class FindMaxMin_3 {
    public static void main(String[] args) {
        int[] arr = {100, 25, 67, 2, 89, 55};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
