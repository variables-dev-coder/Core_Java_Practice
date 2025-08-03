package revision_2ArraysStringRecursion;


public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("String is a rotation");
        } else {
            System.out.println("Not a rotation");
        }
    }
}

/*

String Rotation Check
Check if s2 is a rotation of s1.
Logic:
Concatenate s1 with itself. If s2 is a substring of it → it's a rotation.
Dry Run:
s1 = "abcde", s2 = "deabc"
s1+s1 = "abcdeabcde"
"deabc" is in it → done

 */