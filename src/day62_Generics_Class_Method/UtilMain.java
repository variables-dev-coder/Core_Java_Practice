package day62_Generics_Class_Method;

//Generic Swap Method
//Logic: Swap two elements of any type.


import java.util.Arrays;

class Util {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class UtilMain {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        Util.swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr)); // [C, B, A]
    }
}

//Dry Run:
//arr = [A, B, C]
//swap(0,2) → [C, B, A]

