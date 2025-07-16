package day26_Singly_LinkedList;


class Node5 {
    int data;
    Node5 next;

    Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main Public class
public class SinglyLinkedList_4 {

    Node5 head;

    // Add first
    public void addFirst(int data) {
        Node5 newNode = new Node5(data);
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addLast(int data) {
        Node5 newNode = new Node5(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node5 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Print method
    public void print() {
        Node5 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        SinglyLinkedList_4 list = new SinglyLinkedList_4();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);

        list.print();
    }
}
