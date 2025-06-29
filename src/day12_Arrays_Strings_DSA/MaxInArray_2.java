package day12_Arrays_Strings_DSA;

public class MaxInArray_2 {
    public static void main(String[] args) {
        int[] arr = {13, 56, 34, 67, 99, 23, 67, 33};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Number is: " + max);
    }
}
