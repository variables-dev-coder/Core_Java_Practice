package day27_Doubly_Linked_List;

class DoublyNode16 {
    int data;
    DoublyNode16 prev;
    DoublyNode16 next;

    DoublyNode16(int data) {
        this.data = data;
    }
}

public class DLL_Reverse {
    DoublyNode16 head;

    public void insertAtEnd(int data) {
        DoublyNode16 newNode = new DoublyNode16(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode16 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void printDLL() {
        DoublyNode16 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverseDLL() {
        DoublyNode16 current = head;
        DoublyNode16 temp = null;

        while (current != null) {
            // Swap next and prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to next node in original order (prev after swap)
            current = current.prev;
        }

        // Set new head
        if (temp != null)
            head = temp.prev;
    }

    public static void main(String[] args) {
        DLL_Reverse list = new DLL_Reverse();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("Original:");
        list.printDLL();

        list.reverseDLL();

        System.out.println("Reversed:");
        list.printDLL();
    }
}
