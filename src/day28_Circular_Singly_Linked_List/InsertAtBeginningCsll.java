package day28_Circular_Singly_Linked_List;

public class InsertAtBeginningCsll {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
            System.out.println("Back to Head");
    }

    public static void main(String[] args) {
        InsertAtBeginningCsll csll = new InsertAtBeginningCsll();

        csll.insertAtBeginning(30);
        csll.insertAtBeginning(20);
        csll.insertAtBeginning(10);

        csll.display();
    }
}
