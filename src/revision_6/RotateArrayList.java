package revision_6;


/*
Problem 1: Rotate an ArrayList by K positions (Right Shift)
Given an ArrayList, shift elements to the right by K steps.

Input: [1, 2, 3, 4, 5], K = 2
Output: [4, 5, 1, 2, 3]

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;

        // Normalize K (in case it's bigger than list size)
        k = k % list.size();

        // Right rotation using subList
        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(list.size() - k, list.size())); // last k elements
        rotated.addAll(list.subList(0, list.size() - k)); // remaining elements

        System.out.println("Rotated List: " + rotated);
    }
}


/*

Rotated List: [4, 5, 1, 2, 3]


Dry Run

Input: list = [1,2,3,4,5], k = 2
list.size() = 5 → k = 2 % 5 = 2
list.subList(5-2, 5) → list.subList(3, 5) → [4, 5]
list.subList(0, 3) → [1, 2, 3]
rotated = [4, 5] + [1, 2, 3] = [4, 5, 1, 2, 3]
Output → Rotated List: [4, 5, 1, 2, 3]


 */