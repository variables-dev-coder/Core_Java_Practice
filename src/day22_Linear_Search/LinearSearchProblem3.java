package day22_Linear_Search;


/*
Problem 3: Search in a String Array (Case-Insensitive)
Question:
Given an array of strings, search for a target word ignoring case. Return the index if found, else return -1.

Logic
Loop through each element of the array.
Compare strings using equalsIgnoreCase() instead of equals().
If found → return index.
If not found → return -1.
 */


public class LinearSearchProblem3 {

    public static int searchStringIgnoreCase(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;  // Not found
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Devid"};
        String target = "Charlie";

        int index = searchStringIgnoreCase(names, target);

        if (index != -1) {
            System.out.println("String found at index: " + index);
        } else {
            System.out.println("String not found.");
        }
    }
}
