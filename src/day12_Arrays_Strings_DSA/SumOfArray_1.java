package day12_Arrays_Strings_DSA;

public class SumOfArray_1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];     // sum = sum + arr[i]
        }
        System.out.println("Total Sum = " + sum);
    }
}
