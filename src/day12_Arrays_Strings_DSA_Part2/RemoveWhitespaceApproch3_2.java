package day12_Arrays_Strings_DSA_Part2;


// Approach 3: Using StringBuilder (More Efficient)


public class RemoveWhitespaceApproch3_2 {
    public static void main(String[] args) {
        String str = "Hello Munna";
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
