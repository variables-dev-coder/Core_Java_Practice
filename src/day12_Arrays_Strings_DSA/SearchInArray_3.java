package day12_Arrays_Strings_DSA;

public class SearchInArray_3 {
    public static void main(String[] args) {
        int[] arr = {100, 261, 25, 678,626};
        int search = 678;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Index at Search: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
