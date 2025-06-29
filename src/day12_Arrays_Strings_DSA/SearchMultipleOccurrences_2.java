package day12_Arrays_Strings_DSA;


// Remove only break point
// Same as searching array

public class SearchMultipleOccurrences_2 {
    public static void main(String[] args) {
        int[] arr = {23, 45, 56, 78, 899, 13, 56};
        int search = 56;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found at Array index: " +i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }

}
