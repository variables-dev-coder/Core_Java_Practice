package day43_Collection_PriorityQueue;


import java.util.LinkedList;
import java.util.Queue;


class Node {
    int data;
    Node left, right;
    Node(int val) { data = val; }
}

public class QueueExample3 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        System.out.print("Level Order Traversal: ");
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
}

//Level Order Traversal: 1 2 3 4 5