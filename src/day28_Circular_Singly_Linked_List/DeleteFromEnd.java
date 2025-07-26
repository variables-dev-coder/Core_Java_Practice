package day28_Circular_Singly_Linked_List;

public class DeleteFromEnd {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;

        // Traverse to second last node
        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head; // Skip the last node
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

    // Insert at end (helper for testing)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    public static void main(String[] args) {
        DeleteFromEnd csll = new DeleteFromEnd();

        csll.insertAtEnd(10);
        csll.insertAtEnd(20);
        csll.insertAtEnd(30);

        csll.display();  // 10 → 20 → 30 → (Back to Head)

        csll.deleteFromEnd();

        csll.display();  // 10 → 20 → (Back to Head)
    }
}
