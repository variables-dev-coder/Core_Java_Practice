package revision12;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
        }

        System.out.println("Maximum: " + max);
    }
}

// Maximum: 9