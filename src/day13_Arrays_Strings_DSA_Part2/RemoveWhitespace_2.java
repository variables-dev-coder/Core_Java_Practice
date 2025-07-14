package day13_Arrays_Strings_DSA_Part2;


// Remove All Whitespaces from a String

// Approach 1: Using replaceAll() (Best, Clean Way)


public class RemoveWhitespace_2 {
    public static void main(String[] args) {
        String str = " L o v e ";

        String noSpaces = str.replaceAll("\\s+", "");

        System.out.println("Original: " + str);
        System.out.println("Without whitespaces: " + noSpaces);
    }
}


//   \\s+ matches all whitespaces (space, tab, newline, etc.)