package day27_Doubly_Linked_List;


// Delete a Node by Value

class DoublyNode11 {
    int data;
    DoublyNode11 prev, next;

    DoublyNode11(int data) {
        this.data = data;
    }
}

public class DLL_DeleteByValue {
    DoublyNode11 head;

    // Insert at end
    public void insertAtEnd(int data) {
        DoublyNode11 newNode = new DoublyNode11(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode11 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DoublyNode11 temp = head;

        // Case 1: Deleting head
        if (temp.data == value) {
            System.out.println("Deleted: " + temp.data);
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }

        // Traverse to find the node
        while (temp != null && temp.data != value)
            temp = temp.next;

        // if not found
        if (temp == null) {
            System.out.println("Value " + value + " not found.");
            return;
        }

        System.out.println("Deleted: " + temp.data);

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    // print list
    public void printList() {
        DoublyNode11 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_DeleteByValue list = new DLL_DeleteByValue();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.printList();  // DLL: 10 20 30 40 50

        list.deleteByValue(30);  // Deletes 30
        list.printList();        // DLL: 10 20 40 50

        list.deleteByValue(10);  // Deletes head
        list.printList();        // DLL: 20 40 50

        list.deleteByValue(99);  // Not found
    }
}
