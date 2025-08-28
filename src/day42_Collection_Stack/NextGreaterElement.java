package day42_Collection_Stack;

/*
Problem 2: Next Greater Element

For each element, find the next greater element on the right.

Input: [4, 5, 2, 25]
Output: [5, 25, 25, -1]

Logic: Traverse from right → left, use stack to store greater elements.
 */


import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        System.out.println(Arrays.toString(nextGreater(arr)));
        // Output: [5, 25, 25, -1]
    }
}

/*
Queue: [10, 20, 30]
Peek: 10
Removed: 10
Queue after poll: [20, 30]

Queue Use Cases (Real-World)

1.Task Scheduling (CPU scheduling, Round Robin).
2.Order Processing (first order first serve).
3.Message Queues (Kafka, RabbitMQ, etc.).
4.Printer Jobs.
5.Breadth First Search (BFS) in graphs/trees.


 */