package day29_Circular_Doubly_Linked_List;


// Insert at Specific Position in Circular Doubly Linked List

class CDLLNode2 {
    int data;
    CDLLNode2 prev;
    CDLLNode2 next;

    CDLLNode2(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class CDLL_InsertAtPosition {

    CDLLNode2 head = null;

    // Insert at front
    public void insertFront(int data) {
        CDLLNode2 newNode = new CDLLNode2(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        CDLLNode2 tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;

        head = newNode;
    }

    // Insert at specific position
    public void insertAtPosition(int data, int pos) {
        CDLLNode2 newNode = new CDLLNode2(data);

        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (head == null && pos > 1) {
            System.out.println("Position out of bounds for empty list.");
            return;
        }

        if (pos == 1) {
            insertFront(data);
            return;
        }

        CDLLNode2 temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        // Position out of bounds
        if (count != pos - 1) {
            System.out.println("Position out of bounds.");
            return;
        }

        CDLLNode2 nextNode = temp.next;

        newNode.next = nextNode;
        newNode.prev = temp;

        temp.next = newNode;
        nextNode.prev = newNode;
    }

    // Display the CDLL
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty");
            return;
        }

        CDLLNode2 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_InsertAtPosition list = new CDLL_InsertAtPosition();
        list.insertFront(30);
        list.insertFront(20);
        list.insertFront(10);
        list.display();  // 10 20 30

        list.insertAtPosition(25, 3); // Insert at position 3
        list.display();  // 10 20 25 30

        list.insertAtPosition(5, 1);  // Insert at front
        list.display();  // 5 10 20 25 30

        list.insertAtPosition(35, 10); // Invalid position
    }
}
