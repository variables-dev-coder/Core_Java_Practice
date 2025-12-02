package revision15;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "mississippi";

        char result = mostFrequentChar(s);
        System.out.println("Most frequent character: " + result);
    }

    public static char mostFrequentChar(String s) {
        int[] freq = new int[256];

        // count frequencies
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int maxCount = 0;
        char maxChar = 0;

        // find max
        for (char c : s.toCharArray()) {
            if (freq[c] > maxCount) {
                maxCount = freq[c];
                maxChar = c;
            }
        }

        return maxChar;
    }
}

// Most frequent character: i