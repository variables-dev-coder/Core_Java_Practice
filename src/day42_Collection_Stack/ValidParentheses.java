package day42_Collection_Stack;


/*
Problem 1: Valid Parentheses
Check if the given string of brackets is valid.

Input: "({[]})"
Output: true

Logic: Push opening brackets into stack. When a closing bracket comes, check if it matches top of stack.
 */


import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
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
        System.out.println(isValid("({[]})")); // true
        System.out.println(isValid("([)]"));   // false
    }
}
