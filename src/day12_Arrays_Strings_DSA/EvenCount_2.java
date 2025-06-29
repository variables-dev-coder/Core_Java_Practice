package day12_Arrays_Strings_DSA;

public class EvenCount_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 6, 7, 8, 9, 10};
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println("Even Count = " + evenCount);
    }
}
