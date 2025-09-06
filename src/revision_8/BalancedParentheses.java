package revision_8;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("((()))"));  // true
        System.out.println(isBalanced("(()"));      // false
    }
}
