package revision_2ArraysStringRecursion;

// Remove Duplicates (Without Set)
// Use nested loop to track and print only unique values.

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 4, 5, 3, 1, 6, 7, 8, 9, 10};

        System.out.print("Unique element: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate  = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
