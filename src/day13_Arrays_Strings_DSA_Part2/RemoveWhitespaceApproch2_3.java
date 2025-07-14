package day13_Arrays_Strings_DSA_Part2;

public class RemoveWhitespaceApproch2_3 {
    public static void main(String[] args) {
        String str = "Approch 2 using for loop";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        System.out.println("Before Spaces: " + str);
        System.out.println("After spaces: " + result);
    }
}
