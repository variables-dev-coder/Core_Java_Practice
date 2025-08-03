package revision_2ArraysStringRecursion;

// Find Maximum
// Iterate through array and compare each element with current max.

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 34, 89, 20};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
