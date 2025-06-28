package day12_Arrays_Strings_DSA;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89, 12, 78, 34};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
