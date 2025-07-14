package day13_Arrays_Strings_DSA_Part2;

public class RemoveWhitespaceApproch2_2 {
    public static void main(String[] args) {
        String str = "H ello World  ";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println("Original: " + str);
        System.out.println("Without While spaces: " + result);
    }
}
