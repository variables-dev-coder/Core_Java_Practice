package day12_Arrays_Strings_DSA;

public class ArrayTraverse {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // for loop
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("for: " + arr[i]);
            sum += arr[i];
        }

        // for each loop
        for (int val : arr) {
            System.out.println("foreach: " + val);
        }

        // While loop
        int i = 0;
        while (i < arr.length) {
            System.out.println("while: " + arr[i]);
            i++;
        }
        System.out.println("sum: " + sum);
    }
}
