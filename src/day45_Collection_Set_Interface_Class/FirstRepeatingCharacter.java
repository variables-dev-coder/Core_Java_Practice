package day45_Collection_Set_Interface_Class;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static Character findFirstRepeatingChar(String str) {
        // Handle edge case: null or empty string
        if (str == null || str.isEmpty()) {
            return null;
        }

        // This set will store characters we have already encountered
        Set<Character> seenCharacters = new HashSet<>();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if we've already seen this character
            if (seenCharacters.contains(ch)) {
                return ch; // Found the first repeat!
            }
            // If not seen, add it to the set for future checks
            seenCharacters.add(ch);
        }

        // If we get here, no repeating character was found
        return null;
    }

    // Main method to test the function
    public static void main(String[] args) {
        String[] testCases = {"apple", "path", "zebra", "aabb", "", "a"};
        for (String test : testCases) {
            Character result = findFirstRepeatingChar(test);
            System.out.println("Input: \"" + test + "\" -> Output: " + result);
        }
    }
}

/*

Input: "apple" -> Output: p
Input: "path" -> Output: null
Input: "zebra" -> Output: null
Input: "aabb" -> Output: a
Input: "" -> Output: null
Input: "a" -> Output: null

 */