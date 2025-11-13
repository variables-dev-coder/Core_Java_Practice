package revision13;


class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

// 3 2 1

//Logic:
//Rewire links one by one using three pointers.
//Concept: Linked list manipulation, pointer tracking.