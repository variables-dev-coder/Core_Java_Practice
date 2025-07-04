package day12_Arrays_Strings_DSA_Part2;


// Remove All Whitespaces from a String

// Approach 1: Using replaceAll() (Best, Clean Way)

public class RemoveWhitespace_1 {
    public static void main(String[] args) {
        String str = "  I am learning Java";

        String noSpace = str.replaceAll("\\s", "");

        System.out.println("original String: " + str);
        System.out.println("Without Whitespaces: " + noSpace);
    }
}



   //    \\s+ matches all whitespaces (space, tab, newline, etc.)