package day27_Doubly_Linked_List;

// DLL Class with Add to End and Print Forward


class Node2 {
    int data;
    Node2 prev;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList_2 {
    Node2 head;

    // Add end
    public void addToEnd(int data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node2 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;
    }

    // Print Forward
    public void printForward() {
        Node2 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Print Backward from tail
    public void printBackward() {
        Node2 curr = head;
        if (curr == null)
            return;

        // go to last node
        while (curr.next != null) {
            curr = curr.next;
        }

        // Now move back
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }
}
