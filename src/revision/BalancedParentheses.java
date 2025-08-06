package revision;

import java.util.Stack;

public class BalancedParentheses {

        public static boolean isBalanced(String input) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();
                    if (!isMatchingPair(top, c)) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }

        private static boolean isMatchingPair(char opening, char closing) {
            return (opening == '(' && closing == ')') ||
                    (opening == '{' && closing == '}') ||
                    (opening == '[' && closing == ']');
        }

        public static void main(String[] args) {
            String[] testCases = {
                    "([]){()}",    // true
                    "",             // true
                    "[{()}]",       // true
                    "([)]",         // false
                    "(",           // false
                    "[(])",         // false
                    "{[()]}{}"      // true
            };

            for (String testCase : testCases) {
                System.out.println(testCase + ": " + isBalanced(testCase));
            }
        }
    }
