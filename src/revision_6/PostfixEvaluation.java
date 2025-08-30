package revision_6;


/*
Evaluate a postfix expression using Stack<Integer>.
Example: 23*54*+9-
Equivalent to: (2 * 3) + (5 * 4) - 9 = 6 + 20 - 9 = 17
 */


import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluate(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // convert char to int
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
        String expr = "23*54*+9-";
        System.out.println("Postfix Evaluation: " + evaluate(expr));
    }
}

/*
Dry Run

Expr = "23*54*+9-"
Step 1: push 2 → [2]
Step 2: push 3 → [2,3]
Step 3: * → pop 3,2 → 2*3=6 → [6]
Step 4: push 5 → [6,5]
Step 5: push 4 → [6,5,4]
Step 6: * → pop 4,5 → 5*4=20 → [6,20]
Step 7: + → pop 20,6 → 6+20=26 → [26]
Step 8: push 9 → [26,9]
Step 9: - → pop 9,26 → 26-9=17 → [17]
Final Result → 17



 */