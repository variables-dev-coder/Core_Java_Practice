package day44_Collection_Deque;


import java.util.*;


public class StackUsingDeque {
    Deque<Integer> dq = new ArrayDeque<>();

    // Push element onto stack
    public void push(int x) {
        dq.addLast(x); // Add at the end
    }

    // Pop element from stack
    public int pop() {
        if (dq.isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        return dq.removeLast(); // Remove from end
    }

    // Get top element
    public int top() {
        if (dq.isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        return dq.peekLast(); // View end
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return dq.isEmpty();
    }

    // Demo
    public static void main(String[] args) {
        StackUsingDeque stack = new StackUsingDeque();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());  // 30
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top after pop: " + stack.top()); // 20
    }
}

//Top: 30
//Popped: 30
//Top after pop: 20

/*
Dry Run

push(10) → [10]
push(20) → [10, 20]
push(30) → [10, 20, 30]

top() → 30
pop() → removeLast() = 30
Deque → [10, 20]
top() → 20


 */