package revision_2ArraysStringRecursion;


public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
}

/*
Character Frequency Count
Count how many times each character appears.
Logic:
Use an array of size 256 (ASCII).
Dry Run:
Input: "hello"
Output: h-1, e-1, l-2, o-1
 */