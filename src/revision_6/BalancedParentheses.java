package revision_6;

//Check if a given string has balanced parentheses.

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(str + " → " + isBalanced(str)); // true
    }
}

/*
Dry Run

Input: "{[()]}"
Stack: push { → [{]
       push [ → {[[]
       push ( → {[[(]
       encounter ) → matches ( → pop → {[[
       encounter ] → matches [ → pop → {[
       encounter } → matches { → pop → []
Stack empty → Balanced

 */