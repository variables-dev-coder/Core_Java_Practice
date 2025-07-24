package day27_Doubly_Linked_List;


// Java program to remove duplicates from an Unsorted Doubly Linked List (DLL)

import java.util.HashSet;

class DoublyNode20 {
    int data;
    DoublyNode20 prev;
    DoublyNode20 next;

    DoublyNode20(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class RemoveDuplicatesUnsortedDLL {

    DoublyNode20 head;

    // Add node at end
    public void addLast(int data) {
        DoublyNode20 newNode = new DoublyNode20(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode20 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print DLL
    public void printList() {
        DoublyNode20 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //  Remove Duplicates from Unsorted DLL
    public void removeDuplicatesUnsorted() {
        if (head == null || head.next == null) return;

        HashSet<Integer> seen = new HashSet<>();
        DoublyNode20 curr = head;

        while (curr != null) {
            if (seen.contains(curr.data)) {
                // Remove curr
                DoublyNode20 prev = curr.prev;
                DoublyNode20 next = curr.next;

                if (prev != null) prev.next = next;
                if (next != null) next.prev = prev;

                // If removing head node
                if (curr == head) head = next;
            } else {
                seen.add(curr.data);
            }
            curr = curr.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        RemoveDuplicatesUnsortedDLL dll = new RemoveDuplicatesUnsortedDLL();
        dll.addLast(3);
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(2);
        dll.addLast(4);

        System.out.println("Before removing duplicates:");
        dll.printList();

        dll.removeDuplicatesUnsorted();

        System.out.println("After removing duplicates:");
        dll.printList();
    }
}
