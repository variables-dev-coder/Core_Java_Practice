package revision_16;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<Integer> q = new LinkedList<>();

    // Push element to stack
    public void push(int x) {
        q.offer(x);

        // Rotate queue to bring new element in front
        int size = q.size();
        while (size > 1) {
            q.offer(q.poll());
            size--;
        }
    }

    // Pop from stack
    public int pop() {
        if (q.isEmpty()) return -1;
        return q.poll();
    }

    // Get top element
    public int top() {
        if (q.isEmpty()) return -1;
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top()); // 30
        System.out.println(st.pop()); // 30
        System.out.println(st.pop()); // 20
        System.out.println(st.pop()); // 10
        System.out.println(st.pop()); // -1
    }
}
