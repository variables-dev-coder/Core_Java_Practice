package day27_Doubly_Linked_List;


// to Create a DLL Node


// Doubly Linked List Node class

public class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    // Constructor
    DoublyNode(int data) {
        this .data = data;
        this.prev = null;
        this.next = null;
    }

    // For Testing: print this node's info
    public void printNode() {
        System.out.println("Node data: " + data);
        System.out.println("Prev: " + (prev != null ? prev.data : "null"));
        System.out.println("Next: " + (next != null ? next.data : "null"));
    }

    // Main method
    public static void main(String[] args) {
        DoublyNode dn = new DoublyNode(10);
        dn.printNode();
    }

}
