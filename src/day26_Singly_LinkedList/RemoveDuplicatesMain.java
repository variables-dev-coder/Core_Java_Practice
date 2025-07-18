package day26_Singly_LinkedList;


// Given a sorted linked list, remove all duplicate elements so that each element appears only once

class Node21 {
    int data;
    Node21 next;

    Node21(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList21 {
    Node21 head;

    // Add to end
    public void add(int data) {
        Node21 newNode = new Node21(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node21 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Remove duplicates from sorted list
    public void removeDuplicates() {
        Node21 current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                // Duplicate found → skip next node
                current.next = current.next.next;
            } else {
                // Move forward
                current = current.next;
            }
        }
    }

    // Print list
    public void printList() {
        Node21 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

public class RemoveDuplicatesMain {
    public static void main(String[] args) {
        LinkedList21 list = new LinkedList21();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(40);

        System.out.println("Original list:");
        list.printList();

        list.removeDuplicates();

        System.out.println("After removing duplicates:");
        list.printList();

    }
}
