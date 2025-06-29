package day12_Arrays_Strings_DSA;

public class SearchMultipleOccurrences {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20};    // 20 appears at index 1, 3, and 5
        int search = 20;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found at index: " + i);
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}
