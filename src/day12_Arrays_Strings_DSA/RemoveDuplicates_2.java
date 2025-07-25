package day12_Arrays_Strings_DSA;

public class RemoveDuplicates_2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40};
        int n = arr.length;

        int[] unique = new int[n];  // new array to store unique elements
        int uniqueIndex = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] already added to unique[]
            for (int j = 0; j < uniqueIndex; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        // print unique elements
        System.out.println("Unique elements:");
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.print(unique[i] + " ");
        }

    }
}
