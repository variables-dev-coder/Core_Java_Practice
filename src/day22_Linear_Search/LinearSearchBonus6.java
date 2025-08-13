package day22_Linear_Search;


/*
Question:
Given an integer array and a number k, find the index of the first element divisible by k using
Linear Search. If no such element exists, return -1.

Logic
Loop through the array.
If arr[i] % k == 0 → return index.
If loop ends → return -1.
 */


public class LinearSearchBonus6 {
    public static int firstDivisibleByK(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                return i;
            }
        }
        return -1; // No element divisible by k
    }

    public static void main(String[] args) {
        int[] numbers = {7, 13, 15, 22, 45, 60};
        int k = 5;

        int index = firstDivisibleByK(numbers, k);

        if (index != -1) {
            System.out.println("First element divisible by " + k + " found at index: " + index + " (Value: " + numbers[index] + ")");
        } else {
            System.out.println("No element divisible by " + k);
        }
    }
}
