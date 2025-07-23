package day27_Doubly_Linked_List;

// Delete from Front in Doubly Linked List

class DoublyNode8 {
    int data;
    DoublyNode8 prev;
    DoublyNode8 next;

    DoublyNode8(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_DeleteFromFront {
    DoublyNode8 head;

    // Insert at end (for initial values)
    public void insertAtEnd(int data) {
        DoublyNode8 newNode = new DoublyNode8(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode8 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from front (head)
    public void deleteFromFront() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        System.out.println("Deleted: " + head.data);
        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // Print method
    public void printForward() {
        DoublyNode8 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_DeleteFromFront list = new DLL_DeleteFromFront();


        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.printForward();     // 10 20 30 40 50

        list.deleteFromFront();  // Deleted: 10
        list.printForward();     // DLL: 20 30 40 50

        list.deleteFromFront();  // 20
        list.deleteFromFront();   // 30
        list.deleteFromFront();   // 40
        list.deleteFromFront();   // 50

        list.deleteFromFront();   // List is empty. Nothing to delete.

        list.printForward();

    }
}
