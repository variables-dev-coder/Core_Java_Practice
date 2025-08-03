package revision_2ArraysStringRecursion;


// Search Element
// simple linear search

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}
