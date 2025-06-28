package day12_Arrays_Strings_DSA;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 23, 67};
        int search = 23;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Element " + search + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
