package day12_Arrays_Strings_DSA;

public class EvenCount_1 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even Count = " + evenCount);
    }
}
