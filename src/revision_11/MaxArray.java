package revision_11;

public class MaxArray {
    public static int maxElement(int[] arr) {
        int max = arr[0];

        for (int n : arr) {
            if (n > max) max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 9};
        System.out.println(maxElement(arr));  // 9
    }
}
