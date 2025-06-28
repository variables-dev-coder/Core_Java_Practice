package day12_Arrays_Strings_DSA;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value at index " + i + " is " + arr[i]);
            sum += arr[i];   // keep adding each element
        }

        System.out.println("Sum of all element: " + sum);
    }
}
