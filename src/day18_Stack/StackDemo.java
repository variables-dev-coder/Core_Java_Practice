package day18_Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(70);
        stack.push(100);

        System.out.println("Top element: " + stack.peek());    // 100
        stack.pop();   // removes 100

        System.out.println("After pop, top: " + stack.peek());  // 70
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }
}

// Stack is a linear data structure that follows LIFO order.
// Insertion and removal are done from the same end – the top.