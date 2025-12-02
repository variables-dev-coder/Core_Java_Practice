package revision15;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";

        char result = firstNonRepeating(s);
        if (result == 0) {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }

    public static char firstNonRepeating(String s) {
        int[] freq = new int[256];

        // count frequency
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // find first unique char
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                return c;
            }
        }
        return 0; // means not found
    }
}

// First non-repeating character: w