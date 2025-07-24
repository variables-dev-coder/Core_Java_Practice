package day27_Doubly_Linked_List;

// Reverse Doubly Linked List – Recursive Approach
// Reverse a Doubly Linked List using recursion by swapping the next and prev pointers.


class DoublyNode17 {
    int data;
    DoublyNode17 prev;
    DoublyNode17 next;

    DoublyNode17(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_ReverseRecursive {
    DoublyNode17 head;

    public void insertAtEnd(int data) {
        DoublyNode17 newNode = new DoublyNode17(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode17 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void printDLL() {
        DoublyNode17 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Recursive reversal
    public void reverseDLLRecursive() {
        head = reverseRecursive(head);
    }

    private DoublyNode17 reverseRecursive(DoublyNode17 current) {
        if (current == null) return null;

        DoublyNode17 temp = current.prev;
        current.prev = current.next;
        current.next = temp;

        if (current.prev == null)
            return current;

        return reverseRecursive(current.prev);
    }

    public static void main(String[] args) {
        DLL_ReverseRecursive list = new DLL_ReverseRecursive();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Original:");
        list.printDLL();

        list.reverseDLLRecursive();

        System.out.println("Reversed (Recursive):");
        list.printDLL();
    }
}
