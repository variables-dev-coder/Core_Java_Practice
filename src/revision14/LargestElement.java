package revision14;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 3, 90, 24};
        int max = arr[0];

        for (int x : arr) {
            if (x > max) max = x;
        }

        System.out.println("Max: " + max);   // Max: 90
    }
}
