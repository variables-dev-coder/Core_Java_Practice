package day12_Arrays_Strings_DSA;

public class SearchInArray_4 {
    public static void main(String[] args) {
        int[] arr = {56, 67, 23, 56, 89, 90};
        int search = 78;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Found index at: " +i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Not found");
        }
    }
}
