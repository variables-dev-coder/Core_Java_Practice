package revision_6;

/*
Problem 2: Find the longest string in a List<String>
Approach:

Maintain a variable longest to store the current longest string.
Iterate through the list, check each string’s length.
If a string is longer than longest, update it.

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "Python", "C", "JavaScript", "Go", "Rust"));

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Words: " + words);
        System.out.println("Longest String: " + longest);
    }
}

//Words: [Java, Python, C, JavaScript, Go, Rust]
//Longest String: JavaScript

/*
Dry Run:
words = [Java, Python, C, JavaScript, Go, Rust]
longest = ""

Step 1: "Java" → length 4 > 0 → longest = "Java"
Step 2: "Python" → length 6 > 4 → longest = "Python"
Step 3: "C" → length 1 < 6 → skip
Step 4: "JavaScript" → length 10 > 6 → longest = "JavaScript"
Step 5: "Go" → length 2 < 10 → skip
Step 6: "Rust" → length 4 < 10 → skip


 */

