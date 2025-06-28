package day12_Arrays_Strings_DSA;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {4, 11, 45, 6, 23, 67};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even number: " + evenCount);
        System.out.println("Odd number: " + oddCount);
    }
}
