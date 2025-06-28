package day12_Arrays_Strings_DSA;

public class ArrayBasics {
    public static void main(String[] args) {

        int[] arr = new int[5];     // default values: 0
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;

        for (int i = 0; i < arr.length; i++){
            System.out.println("value at index " + i + " is " + arr[i]);
        }
    }
}
