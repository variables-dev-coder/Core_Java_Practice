package day42_Collection_Stack;

/*
Problem 3: Min Stack (Get Min in O(1))

Design a stack that supports push, pop, top, and retrieving min in O(1).

Logic: Use two stacks → one for values, one for min values.
 */


import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);
        System.out.println(ms.getMin()); // 2
        ms.pop();
        System.out.println(ms.getMin()); // 3
    }
}
