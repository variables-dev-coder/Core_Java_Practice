package day12_Arrays_Strings_DSA;

public class SearchInArray_2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 10};
        int search = 10;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found at Index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}


// take search first index then loop stop