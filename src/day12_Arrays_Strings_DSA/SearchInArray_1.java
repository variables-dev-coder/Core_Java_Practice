package day12_Arrays_Strings_DSA;

public class SearchInArray_1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int search = 30;

        boolean found = false;

        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found at index: " + i);
                found = true;
                break;    // stop checking once found
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
