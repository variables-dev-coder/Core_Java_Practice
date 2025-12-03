package revision15;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop(); // duplicate found → remove
            } else {
                st.push(c);
            }
        }

        // build final string
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s)); // Output: ca
    }
}
