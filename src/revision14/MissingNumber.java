package revision14;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;

        int expected = n * (n + 1) / 2;
        int actual = 0;

        for (int x : arr) actual += x;

        System.out.println("Missing: " + (expected - actual));
    }
}

// Missing: 3