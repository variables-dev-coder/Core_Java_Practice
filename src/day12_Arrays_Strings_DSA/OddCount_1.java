package day12_Arrays_Strings_DSA;

public class OddCount_1 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println("Odd Count = " + oddCount);
    }
}
