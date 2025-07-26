package day28_Circular_Singly_Linked_List;


class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularSinglyLinkedList {
    Node head = null;

    // Insert at the end
    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Display nodes
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertEnd(10);
        csll.insertEnd(20);
        csll.insertEnd(30);
        csll.display();  // Output: 10 → 20 → 30 → (Back to Head)
    }
}
