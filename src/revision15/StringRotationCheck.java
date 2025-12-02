package revision15;

public class StringRotationCheck {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        boolean result = isRotation(s1, s2);
        System.out.println(result);
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        String combined = s1 + s1;

        return combined.contains(s2); // true
    }
}
