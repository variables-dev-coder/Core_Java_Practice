package day26_Singly_LinkedList;

class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList_1 {
    Node1 head;

    // Add node at the beginning
    public void addFirst(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node1 curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Print the list
    public void printList() {
        Node1 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList_1 list = new SinglyLinkedList_1();

        list.addFirst(11);   // List: 11
        list.addFirst(10);   // List: 10 -> 11
        list.addLast(40);    // List: 10 -> 11 -> 40
        list.addFirst(5);    // List: 5 -> 10 -> 11 -> 40
        list.addLast(20);    // List: 5 -> 10 -> 11 -> 40 -> 20
        list.addLast(4);     // List: 5 -> 10 -> 11 -> 40 -> 20 -> 4
        list.addLast(30);    // List: 5 -> 10 -> 11 -> 40 -> 20 -> 4 -> 30

        list.printList();
    }
}
