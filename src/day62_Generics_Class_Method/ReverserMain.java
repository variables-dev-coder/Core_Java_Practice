package day62_Generics_Class_Method;

// Generic Method to Reverse Array

import java.util.Arrays;

class Reverser {
    public static <T> void reverse(T[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

public class ReverserMain {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4};
        Reverser.reverse(nums);
        System.out.println(Arrays.toString(nums)); // [4, 3, 2, 1]
    }
}

