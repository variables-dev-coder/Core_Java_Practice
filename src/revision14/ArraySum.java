package revision14;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int x : arr) sum += x;

        System.out.println("Sum: " + sum);  // Sum: 15
    }
}
