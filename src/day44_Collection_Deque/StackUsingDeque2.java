package day44_Collection_Deque;

/*
Problem: Implement Stack using Deque

You are asked to implement a Stack (LIFO) using Java’s Deque (ArrayDeque).

Expected operations:

push(x) → Insert element.

pop() → Remove top element.

peek() → View top element.

isEmpty() → Check if stack is empty.

 */

import java.util.ArrayDeque;
import java.util.Deque;


public class StackUsingDeque2 {
    private Deque<Integer> deque = new ArrayDeque<>();

    // Push element onto stack
    public void push(int x) {
        deque.addLast(x); // add at the end
    }

    // Pop element from stack
    public int pop() {
        if (deque.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return deque.removeLast(); // remove from end
    }

    // Peek top element
    public int peek() {
        if (deque.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return deque.peekLast();
    }

    // Check empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingDeque2 stack = new StackUsingDeque2();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Pop: " + stack.pop()); // 20
        System.out.println("Is Empty? " + stack.isEmpty()); // false
        System.out.println("Pop: " + stack.pop()); // 10
        System.out.println("Is Empty? " + stack.isEmpty()); // true
    }
}

/*

Top element: 30
Pop: 30
Pop: 20
Is Empty? false
Pop: 10
Is Empty? true


Explanation

We use addLast() / removeLast() / peekLast()
because Stack = Last In First Out (LIFO).

If we used addFirst() / removeFirst(), it would still work (reversed orientation).

This is a common interview test: Implement Stack using Deque instead of Stack class (since Stack is legacy)

 */

