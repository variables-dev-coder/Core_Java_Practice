package day29_Circular_Doubly_Linked_List;


// Circular Doubly Linked List, Insert at End (Tail)

public class InsertAtEnd {
    Node1 head = null;
    Node1 tail = null;

    class Node1 {
        int data;
        Node1 next;
        Node1 prev;

        Node1(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtEnd(int value) {
        Node1 newNode = new Node1(value);

        if (head == null) {
            head = tail = newNode;
            head.next = newNode;
            head.prev = head;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;

        newNode.next = head;
        head.prev = newNode;

        tail = newNode;
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node1 temp = head;
        do {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to head)");
    }

    public static void main(String[] args) {
        InsertAtEnd cdll = new InsertAtEnd();

        cdll.insertAtEnd(10);
        cdll.insertAtEnd(20);
        cdll.insertAtEnd(30);
        cdll.insertAtEnd(40);
        cdll.insertAtEnd(50);

        cdll.displayForward();
    }
}


/*

Insert at End (Tail)
🔹 Logic:
If list is empty → set head and tail to newNode and connect circular links.

Else → update tail.next = newNode, newNode.prev = tail, and update tail = newNode.

Finally → make it circular:

tail.next = head

head.prev = tail

 */