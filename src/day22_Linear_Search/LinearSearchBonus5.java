package day22_Linear_Search;


/*
Question:
Given an array and a target element, count how many times that element occurs using Linear Search.

Logic
Initialize count = 0.
Loop through the array.
If an element equals the target → increment count.
After the loop, return count.
 */


public class LinearSearchBonus5 {
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 30, 20, 40, 50, 20};
        int target = 20;

        int occurrences = countOccurrences(numbers, target);

        System.out.println(target + " appears " + occurrences + " times in the array.");
    }

}
