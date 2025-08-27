package day42_Collection_Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample2 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());   // 30
        System.out.println(stack.peek());  // 20
    }
}
