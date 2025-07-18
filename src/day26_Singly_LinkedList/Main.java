package day26_Singly_LinkedList;

// Find the Nth Node from the End of a Singly Linked List

class Node11 {
    int data;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node11 head;

    // add to end
    public void add(int data) {
        Node11 newNode = new Node11(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node11 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Find Nth from end

    public void findNthFromEnd(int n) {
        Node11 fast = head;
        Node11 slow = head;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                System.out.println("Last has fewer than " + n + " nodes.");
                return;
            }
            fast = fast.next;
        }

        // Move both fast and slow
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println("Nth node from end: " + slow.data);
    }

    public void printList() {
        Node11 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}


public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.printList();
        list.findNthFromEnd(2);
    }
}
