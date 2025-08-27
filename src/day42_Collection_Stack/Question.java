package day42_Collection_Stack;

public class Question {
    public static void main(String[] args) {
        /*

1. What is a Stack in Java?

A stack is a linear data structure that follows the LIFO (Last In, First Out) principle.
In Java, Stack<E> is a class in java.util package that extends Vector<E>.

Key Methods:
    push(E item) → Inserts element on top.
    pop() → Removes and returns the top element.
    peek() → Returns the top element without removing.
    empty() → Checks if stack is empty.
    search(Object o) → Returns 1-based position of element from the top, else -1.

2. Difference between Stack class and custom stack implementation?
    Stack class in Java is legacy (extends Vector, synchronized).
    Custom stack can be implemented using arrays or LinkedList, giving more control and efficiency (non-synchronized).


3. Is Java Stack thread-safe?
    Yes, because it extends Vector which has synchronized methods.
    But synchronization makes it slower.
    For high-performance applications, prefer ArrayDeque for stack operations.

4. How to implement stack using ArrayDeque?

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());   // 30
        System.out.println(stack.peek());  // 20
    }
}

ArrayDeque is faster than Stack.

5. Explain search() in Stack?
    search(Object o) returns position (1-based index from top) of element.
    Returns -1 if element not found.

Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
stack.push("C");

System.out.println(stack.search("B")); // 2 (from top: C->1, B->2)
System.out.println(stack.search("X")); // -1


6. Real-time use cases of Stack in Java?
    Undo/Redo in editors.
    Browser Back/Forward navigation.
    Expression evaluation (postfix/prefix).
    Balanced parentheses checking.
    Recursive function call management.

7. What are drawbacks of Stack class?
    Being legacy, it’s less efficient compared to ArrayDeque.
    It has extra synchronization overhead.
    Most developers prefer Deque for stack operations.

8. Real-time use cases of Stack?
    Undo/Redo in editors
    Browser back/forward navigation
    Expression evaluation (((a+b)*c))
    Recursive function calls (Call Stack)

9. Time complexity of stack operations?
Answer:
    push() → O(1)
    pop() → O(1)
    peek() → O(1)
    search() → O(n)

10. Can we implement Stack without Stack class?

Answer:
Yes.
Using Array (fixed size).
Using LinkedList (dynamic size).
Using ArrayDeque (recommended, faster).


11. Is Stack synchronized in Java?

Answer:
Yes, Stack is synchronized since it extends Vector. But because of
 synchronization, it’s slower than alternatives like ArrayDeque for stack operations.

12. Difference between Stack and Queue?

Answer:
Stack: LIFO (Last In, First Out) → e.g., Browser back button
Queue: FIFO (First In, First Out) → e.g., Printer queue

13. What is a Stack in Java?

Answer:
A stack is a LIFO (Last In, First Out) data structure. In Java, it’s implemented using
the Stack class (java.util.Stack) which extends Vector.

    push() → insert element on top
    pop() → remove top element
    peek() → see top element without removing
    empty() → check if stack is empty
    search() → position of element (1-based index from top)

    
         */
    }
}
