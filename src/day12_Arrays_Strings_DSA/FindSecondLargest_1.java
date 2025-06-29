package day12_Arrays_Strings_DSA;

public class FindSecondLargest_1 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 67, 30, 40};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}
