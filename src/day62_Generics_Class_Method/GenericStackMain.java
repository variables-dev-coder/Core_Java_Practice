package day62_Generics_Class_Method;

// Generic Stack Implementation

import java.util.ArrayList;
import java.util.List;

class GenericStack<T> {
    private List<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class GenericStackMain {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("A");
        stack.push("B");
        System.out.println(stack.pop()); // B
    }
}
