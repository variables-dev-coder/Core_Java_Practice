package day12_Arrays_Strings_DSA;

public class ArrayBasics2 {
    public static void main(String[] args) {

        int[] arr = new int[7];
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 13;
        arr[4] = 14;
        arr[5] = 15;
        arr[6] = 16;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value at index " + i + " is " + arr[i]);
        }
    }
}
