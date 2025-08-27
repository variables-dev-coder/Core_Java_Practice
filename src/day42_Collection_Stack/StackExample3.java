package day42_Collection_Stack;

import java.util.Stack;

public class StackExample3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.search("B")); // 2 (from top: C->1, B->2)
        System.out.println(stack.search("X")); // -1

    }
}
