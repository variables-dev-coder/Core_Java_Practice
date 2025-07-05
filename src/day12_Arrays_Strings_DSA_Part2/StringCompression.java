package day12_Arrays_Strings_DSA_Part2;

public class StringCompression {

    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Count repeating characters
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append current character and count
            compressed.append(str.charAt(i)).append(count);
            count = 1;  // Reset count
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
        System.out.println(compress("aaabbbbcccrrr"));
        
    }
}
