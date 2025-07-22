package day27_Doubly_Linked_List;

class DoublyNode5 {
    int data;
    DoublyNode5 prev;
    DoublyNode5 next;

    DoublyNode5 (int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_InsertAtIndex {
    DoublyNode5 head;

    // Insert at a Specific index
    public void insertAtIndex(int index, int data) {
        DoublyNode5 newNode = new DoublyNode5(data);

        // Case 1: Insert at Head (index = 0)
        if (index == 0) {
            newNode.next = head;
            if (head != null)
                head.prev = newNode;
                head = newNode;
            return;
        }

        DoublyNode5 temp = head;
        int count = 0;

        // Traverse to node before the index
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds!");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = newNode;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // Print forward
    public void printForward() {
        DoublyNode5 temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_InsertAtIndex list = new DLL_InsertAtIndex();

        list.insertAtIndex(0, 10);  // 10
        list.insertAtIndex(1, 20);  // 10, 20
        list.insertAtIndex(1, 30);  // 10, 30, 20
        list.insertAtIndex(3, 40);  // 10, 30, 20, 40
        list.insertAtIndex(4, 50);  // 10, 30, 20, 40, 50

        list.insertAtIndex(6, 80);  // 10, 20, 30, 40, 50, 80  invalid

        list.printForward();
    }

}
