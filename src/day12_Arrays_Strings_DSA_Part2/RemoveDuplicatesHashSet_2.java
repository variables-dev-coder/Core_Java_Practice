package day12_Arrays_Strings_DSA_Part2;


// Write a program to remove duplicate characters from a given string while maintaining the original order.

import java.util.HashSet;

public class RemoveDuplicatesHashSet_2 {
    public static void main(String[] args) {
        String input = "jjannu";

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {

                result.append(ch);
                seen.add(ch);
            }
        }
        System.out.println("Original: " + input);
        System.out.println("After Remove duplicate: " + result);
    }
}
