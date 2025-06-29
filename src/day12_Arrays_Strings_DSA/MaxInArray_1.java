package day12_Arrays_Strings_DSA;

public class MaxInArray_1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int max = arr[0];    // Assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];    // update max if current element is greater
            }
        }
        System.out.println("Maximum Number is : " + max);
    }
}
