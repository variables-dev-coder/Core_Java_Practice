package day27_Doubly_Linked_List;


// Delete at a Specific Index in Doubly Linked List


class DoublyNode10 {
    int data;
    DoublyNode10 prev;
    DoublyNode10 next;

    DoublyNode10(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_DeleteAtIndex {
    DoublyNode10 head;

    // Insert at end
    public void insertAtEnd(int data) {
        DoublyNode10 newNode = new DoublyNode10(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode10 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete at specific index
    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (index == 0) {
            System.out.println("Deleted: " + head.data);
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        DoublyNode10 temp = head;
        int count = 0;

        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        System.out.println("Deleted: " + temp.data);

        if (temp.next != null)
            temp.next.prev = temp.next;
    }

    // printed list forward
    public void  printForward() {
        DoublyNode10 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_DeleteAtIndex list = new DLL_DeleteAtIndex();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.printForward(); // DLL: 10 20 30 40

        list.deleteAtIndex(2); // Deletes 30
        list.printForward();   // DLL: 10 20 40

        list.deleteAtIndex(0); // Deletes 10
        list.printForward();   // DLL: 20 40

        list.deleteAtIndex(5); // Index out of bounds

    }
}
