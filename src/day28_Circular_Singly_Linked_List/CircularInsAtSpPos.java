package day28_Circular_Singly_Linked_List;

// Insert at a Specific Position in Circular Singly Linked List

public class CircularInsAtSpPos {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert at position
    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            if (head == null) {
                head = newNode;
                newNode.next = head;
            } else {
                Node temp = head;
                while (temp.next != head)
                    temp = temp.next;

                newNode.next = head;
                temp.next = newNode;
                head = newNode;
            }
            return;
        }

        Node temp = head;
        int count = 1;
        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display list
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
        CircularInsAtSpPos csll = new CircularInsAtSpPos();

        csll.insertAtPos(10, 1);
        csll.insertAtPos(20, 2);
        csll.insertAtPos(30, 2);  // Insert at middle

        csll.display(); // 10 → 30 → 20 → (Back to Head)
    }

}
