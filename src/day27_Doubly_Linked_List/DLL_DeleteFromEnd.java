package day27_Doubly_Linked_List;


// Delete from End in Doubly Linked List

class DoublyNode9 {
    int data;
    DoublyNode9 prev;
    DoublyNode9 next;

    DoublyNode9(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_DeleteFromEnd {
    DoublyNode9 head;

    // Insert at end
    public void insertAtEnd(int data) {
        DoublyNode9 newNode = new DoublyNode9(data);
        while (head == null) {
            head = newNode;
            return;
        }

        DoublyNode9 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty, Nothing to delete.");
            return;
        }

        if (head.next == null) {
            System.out.println("Deleted: " + head.data);
            head = null;
            return;
        }

        DoublyNode9 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.println("Deleted: " + temp.data);
        temp.prev.next = null;
    }

    // Print DLL
    public void printForward() {
        DoublyNode9 temp = head;
        System.out.print("DLL:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_DeleteFromEnd list = new DLL_DeleteFromEnd();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.printForward();         // DLL:10 20 30 40

        list.deleteFromEnd();        // Deleted: 40
        list.printForward();     // DLL:10 20 30

        list.deleteFromEnd();   // Deleted: 30
        list.deleteFromEnd();    //  Deleted: 20
        list.deleteFromEnd();    // Deleted: 10

        list.deleteFromEnd();   // List is empty, Nothing to delete.
    }
}
