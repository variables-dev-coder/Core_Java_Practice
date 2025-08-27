package day42_Collection_Stack;

/*
Problem 5: Stock Span Problem

For each day, find how many consecutive days stock price was less or equal.

Input: [100, 80, 60, 70, 60, 75, 85]
Output: [1, 1, 1, 2, 1, 4, 6]

Logic: Use stack to store indexes.
 */


import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(calculateSpan(prices)));
        // Output: [1, 1, 1, 2, 1, 4, 6]
    }
}
