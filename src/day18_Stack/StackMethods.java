package day18_Stack;

// Stack All Methods

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // peek
        System.out.println("Top: " + stack.peek());

        // Pop
        System.out.println("Popped: " + stack.pop());

        // Size
        System.out.println("Size: " + stack.size());

        // Search
        System.out.println("Position of 10: " + stack.search(10));

        // Empty check
        System.out.println("Is empty: " + stack.isEmpty());
    }
}
