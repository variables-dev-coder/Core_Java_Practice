package day26_Singly_LinkedList;



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    // 1. Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);   // create new node
        newNode.next = head;             // point newNode to current head
        head = newNode;                  // make newNode the new head
    }

    // 2. Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);      // create new node
        if (head == null) {                 // if list is empty
            head = newNode;
            return;
        }

        Node temp = head;              // start from head
        while (temp.next != null) {    // traverse till last node
            temp = temp.next;
        }
        temp.next = newNode;            // link last node to newNode
    }

    // 3. Print the list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst(10);     // list: 10
        list.addLast(20);     // list: 10 -> 20
        list.addLast(30);     // list: 10 -> 20 -> 30

        list.printList();          // Output: 10 -> 20 -> 30 -> null
    }
}
