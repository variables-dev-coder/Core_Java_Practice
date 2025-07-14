package day13_Arrays_Strings_DSA_Part2;


// Approach 3: Using StringBuilder (More Efficient)


public class RemoveWhitespaceApproch3_3 {
    public static void main(String[] args) {
        String str = " Wel   co m e";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                result.append(ch);
            }
        }

        System.out.println("Before: " + str);
        System.out.println("After: " + result.toString());
    }
}