package day27_Doubly_Linked_List;


// Create Node and Basic DLL Structure


class Node1 {
    int data;
    Node1 prev;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node1 head;

    // Print Forward
    public void printForward() {
        Node1 temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print backward
    public void printBackward() {
        Node1 temp = head;
        // Got to last Node
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Insert data at front
    public void insertAtFrond(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = head;
        if (head != null) 
            head.prev = newNode;
            head = newNode;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtFrond(10);
        dll.insertAtFrond(20);
        dll.insertAtFrond(30);
        dll.insertAtFrond(40);

        dll.printForward();
        dll.printBackward();
    }
}
