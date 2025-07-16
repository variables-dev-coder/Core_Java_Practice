package day26_Singly_LinkedList;


class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList_3 {
    Node3 head;

    // Add First, Beginning
    public void addFirst(int data) {
        Node3 newNode = new Node3(data);
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addLast(int data) {
        Node3 newNode = new Node3(data);
        if (head == null) {
            head = newNode;
        }

        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print List
    public void print() {
        Node3 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        SinglyLinkedList_3 list = new SinglyLinkedList_3();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(9);
        list.addLast(30);
        list.addLast(26);

        list.print();
    }
}
