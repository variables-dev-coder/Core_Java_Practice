package day42_Collection_Stack;

/*
Problem 4: Evaluate Postfix Expression

Given postfix expression "231*+9-", evaluate it.

Expression: 2 + (3 * 1) - 9 = -4

Logic: Traverse expression, push numbers, pop two on operator.
 */


import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : exp.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (ch) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluate("231*+9-")); // -4
    }
}
