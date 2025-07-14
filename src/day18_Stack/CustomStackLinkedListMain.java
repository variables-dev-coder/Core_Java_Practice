package day18_Stack;

// Custom Stack Using LinkedList

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedStack {
    Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }

        int val = top.data;
        top = top.next;
        return val;
    }

    public int peek() {
        return isEmpty() ? -1 : top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class CustomStackLinkedListMain {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());
        
        System.out.println(stack.isEmpty());

    }

}
