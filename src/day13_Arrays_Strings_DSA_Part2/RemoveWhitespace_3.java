package day13_Arrays_Strings_DSA_Part2;

public class RemoveWhitespace_3 {
    public static void main(String[] args) {
        String s = "    M u n n a   ";
        String noSpaces = s.replaceAll("\\s+", "");
        System.out.println("Original: " + s);
        System.out.println("No white Space: " + noSpaces);
    }
}


// \\s+ matches all whitespaces (space, tab, newline, etc.)