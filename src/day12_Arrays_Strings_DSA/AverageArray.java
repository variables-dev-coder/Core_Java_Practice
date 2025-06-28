package day12_Arrays_Strings_DSA;

public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {10, 39, 25, 45};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
