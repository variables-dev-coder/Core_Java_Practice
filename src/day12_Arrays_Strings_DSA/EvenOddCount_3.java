package day12_Arrays_Strings_DSA;

public class EvenOddCount_3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 3, 5, 7};
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);
    }
}
