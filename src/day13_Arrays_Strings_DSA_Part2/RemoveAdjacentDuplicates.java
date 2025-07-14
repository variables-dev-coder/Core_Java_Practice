package day13_Arrays_Strings_DSA_Part2;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        // Reconstruct string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
