package day29_Circular_Doubly_Linked_List;

// Insert at Front in Circular Doubly Linked List

class CDLLNode {
    int data;
    CDLLNode prev;
    CDLLNode next;

    CDLLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class CDLL_InsertFront {

    CDLLNode head = null;

    // Insert at front
    public void insertFront(int data) {
        CDLLNode newNode = new CDLLNode(data);
        if (head == null) {
            head = newNode;
            newNode.prev = newNode;
            newNode.next = newNode;
            return;
        }

        CDLLNode tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        head.prev = newNode;
        tail.next = newNode;

        head = newNode;
    }

    // Display CDLL
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty");
            return;
        }

        CDLLNode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_InsertFront list = new CDLL_InsertFront();
        list.insertFront(30);
        list.insertFront(20);
        list.insertFront(10);

        list.display();  // Output: 10 20 30
    }
}

