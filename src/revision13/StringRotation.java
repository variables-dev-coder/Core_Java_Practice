package revision13;

//Check if a String is Rotation of Another
//Example:
//S1 = "abcde", S2 = "cdeab" → Rotation

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";

        if (s1.length() == s2.length() && (s1 + s1).contains(s2))
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }
}

// Rotation

//Logic:
//If S2 is substring of S1+S1, then rotation.
//Concept: String concatenation and substring check.