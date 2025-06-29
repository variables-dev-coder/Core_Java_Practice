package day12_Arrays_Strings_DSA;

public class SumOfArray_3 {
    public static void main(String[] args) {
        int[] arr = {34, 56, 78, 23};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Total sum = " + sum);
    }
}
