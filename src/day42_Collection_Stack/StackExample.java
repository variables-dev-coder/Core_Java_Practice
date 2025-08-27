package day42_Collection_Stack;


// LIFO (Last In, First Out) principle

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Popped: " + stack.pop());

        // After pop
        System.out.println("Stack after pop: " + stack);

        // Search element
        System.out.println("Position of 'Java': " + stack.search("Java"));

        // Check if empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}

/*
Stack: [Java, Python, C++, JavaScript]
Top element: JavaScript
Popped: JavaScript
Stack after pop: [Java, Python, C++]
Position of 'Java': 3
Is stack empty? false


5. Key Points
Stack is synchronized (like Vector), hence slower than modern alternatives like ArrayDeque.
But it is still widely asked in interviews.
Real-life use: Undo/Redo, Browser history, Expression evaluation, DFS traversal, Recursion simulation.



 */