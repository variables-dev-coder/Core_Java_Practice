package revision15;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                // If closing bracket
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }

        return stack.isEmpty(); // must be empty if valid
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[(])}";

        System.out.println(isValid(s1)); // true
        System.out.println(isValid(s2)); // false
    }
}
