package day12_Arrays_Strings_DSA;

public class FindMaxMinArray_3 {
    public static void main(String[] args) {
        int[] arr = {5, 78, 100, 2, 1};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum Number is: " + max + ", Minimum Number is: " + min);
    }
}
