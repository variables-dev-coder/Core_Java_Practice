package day12_Arrays_Strings_DSA_Part2;


// Java Program: Anagram Check using Sorting

import java.util.Arrays;

public class AnagramCheck_1 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Convert to lower cases and remove spaces if needed
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check length
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Convert to char array and sort
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("They are Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }
}



/*

What is an Anagram?
Two strings are anagrams if:

They contain the same characters

In any order

With same frequency

🔸 Examples:

"listen" and "silent" ✅

"race" and "care" ✅

"aab" and "aba" ✅

"aab" and "abb" ❌

 */


/*

Logic Explanation:
There are 3 common ways to check anagrams:

Sort both strings, then compare.

Count frequency of each character in both and compare.

Use a HashMap or an int[] of size 256.

 */