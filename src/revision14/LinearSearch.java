package revision14;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 9, 1};
        int k = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}

// Found at index 3