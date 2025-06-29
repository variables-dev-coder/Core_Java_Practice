package day12_Arrays_Strings_DSA;

public class FindSecondSmallest_1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 47};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num < second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Smallest: " + second);
    }
}
