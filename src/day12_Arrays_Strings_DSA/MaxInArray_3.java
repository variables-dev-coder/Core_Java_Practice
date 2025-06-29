package day12_Arrays_Strings_DSA;

public class MaxInArray_3 {
    public static void main(String[] args) {
        int[] arr = {90, 56, 45, 100, 0, 90};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Number is: " + max);
    }
}
