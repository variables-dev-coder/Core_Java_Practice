package day16_Recursion;

public class PrintArrayRecursively {

    static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;   // base case: stop when index reaches end
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);    // recursive call

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printArray(arr, 0);    // start from index
    }
}
