package day12_Arrays_Strings_DSA;


// Given an array of integers, count how many are even and how many are odd.


public class EvenOddCount_1 {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
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
