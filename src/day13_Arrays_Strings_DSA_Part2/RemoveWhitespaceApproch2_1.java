package day13_Arrays_Strings_DSA_Part2;


// Approach 2: Using a for loop (Manual way)

public class RemoveWhitespaceApproch2_1 {
    public static void main(String[] args) {
        String str = "Munna is a Java Developer ";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Without White Spaces: " + result);
    }
}
