package day16_Stack;


// Custom Stack Using Array (Fixed Size)

class CustomStack {
    int[] stack;
    int top;
    int capacity;

    public CustomStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        return (isEmpty()) ? -1 : stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
}

public class CustomStackMain {
    public static void main(String[] args) {
        CustomStack cs = new CustomStack(5);

        cs.push(11);
        cs.push(21);
        cs.push(31);
        cs.push(41);
        cs.push(45);

       // cs.push(50);  // stack overflow bcz capacity is 5

        System.out.println(cs.peek());  // 31
        cs.pop();
        System.out.println(cs.peek());   // 21

        System.out.println(cs.capacity);

        System.out.println(cs.top);

        System.out.println(cs.isEmpty());

        System.out.println(cs.size());


    }
}
