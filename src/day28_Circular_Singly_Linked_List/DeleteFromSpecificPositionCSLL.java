package day28_Circular_Singly_Linked_List;


public class DeleteFromSpecificPositionCSLL {

    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Delete from a specific position
    public void deleteFromPosition(int position) {
        if (head == null || position <= 0) {
            System.out.println("Invalid position or list is empty");
            return;
        }

        // If only one node
        if (head.next == head && position == 1) {
            head = null;
            return;
        }

        // Deleting head node
        if (position == 1) {
            Node last = head;
            while (last.next != head)
                last = last.next;

            head = head.next;
            last.next = head;
            return;
        }

        Node temp = head;
        int count = 1;

        // Traverse to (position-1)th node
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        // Invalid position
        if (temp.next == head) {
            System.out.println("Position exceeds list length");
            return;
        }

        temp.next = temp.next.next;
    }

    // Insert at end (helper)
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
        DeleteFromSpecificPositionCSLL csll = new DeleteFromSpecificPositionCSLL();

        csll.insertAtEnd(10);
        csll.insertAtEnd(20);
        csll.insertAtEnd(30);
        csll.insertAtEnd(40);

        csll.display();  // 10 → 20 → 30 → 40 → (Back to Head)

        csll.deleteFromPosition(3);

        csll.display();  // 10 → 20 → 40 → (Back to Head)
    }
}
