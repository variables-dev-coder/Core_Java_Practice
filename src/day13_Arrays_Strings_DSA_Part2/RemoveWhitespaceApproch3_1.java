package day13_Arrays_Strings_DSA_Part2;


// Approach 3: Using StringBuilder (More Efficient)

public class RemoveWhitespaceApproch3_1 {
    public static void main(String[] args) {
        String str = "Munna is a Java Developer";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }
        System.out.println("Before Space: " + str);
        System.out.println("After Trim White spaces: " + result.toString());
    }
}
