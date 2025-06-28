package day12_Arrays_Strings_DSA;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 40, 50, 60};

        System.out.println("Array in reverse:");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
