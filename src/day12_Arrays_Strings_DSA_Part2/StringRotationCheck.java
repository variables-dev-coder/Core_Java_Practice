package day12_Arrays_Strings_DSA_Part2;

public class StringRotationCheck {

    public static void main(String[] args) {
        String original = "ABCD";
        String rotated = "CDAB";

        if (isRotation(original, rotated)) {
            System.out.println("Yes, '" + rotated + "' is a rotation of '" + original + "'");
        } else {
            System.out.println("No, '" + rotated + "' is NOT a rotation of '" + original + "'");
        }
    }
        static boolean isRotation(String s1, String s2) {
            // Check equal length and not null
            if (s1 == null || s2 == null || s1.length() != s2.length()) {
                return false;
            }
            // Concatenate and check
            String temp = s1 + s2;
            return temp.contains(s2);

    }
}
