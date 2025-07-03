package day12_Arrays_Strings_DSA_Part2;


// Write a Java program to remove all duplicate characters from a given string.

public class RemoveDuplicates_2 {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();

        boolean[] seen = new boolean[256];   // ASCII size

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result.toString());
    }
}
