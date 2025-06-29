package day12_Arrays_Strings_DSA;

public class SumOfArray_2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 34, 12};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Total Sum = " + sum);
    }
}
