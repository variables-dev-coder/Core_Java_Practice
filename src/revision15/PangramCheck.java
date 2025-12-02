package revision15;

public class PangramCheck {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";

        boolean result = isPangram(s);
        System.out.println(result ? "Pangram" : "Not Pangram");
    }

    public static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];
        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }

        for (boolean b : seen) {
            if (!b) return false; // if any letter missing
        }
        return true;
    }
}
