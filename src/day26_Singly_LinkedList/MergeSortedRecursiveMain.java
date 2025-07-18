package day26_Singly_LinkedList;

// Given two sorted linked lists, merge them into one sorted linked list and return its head.

class Node22 {
    int data;
    Node22 next;

    Node22(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node22 head;

    // Add to end
    public void add(int data) {
        Node22 newNode = new Node22(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node22 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Print the list
    public void printList() {
        Node22 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge Two Sorted Lists - Recursive
    public static Node22 mergeRecursive(Node22 l1, Node22 l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.data < l2.data) {
            l1.next = mergeRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeRecursive(l1, l2.next);
            return l2;
        }
    }
}

public class MergeSortedRecursiveMain {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList list2 = new LinkedList();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        System.out.println("List 1:");
        list1.printList();
        System.out.println("List 2:");
        list2.printList();

        Node22 mergedHead = LinkedList.mergeRecursive(list1.head, list2.head);

        System.out.println("Merged List (Recursive):");
        Node22 temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
