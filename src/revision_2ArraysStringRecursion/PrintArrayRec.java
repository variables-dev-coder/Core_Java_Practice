package revision_2ArraysStringRecursion;

//  Print Array Elements (Recursively)

public class PrintArrayRec {
    public static void print(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        print(arr, 0);
    }
}
