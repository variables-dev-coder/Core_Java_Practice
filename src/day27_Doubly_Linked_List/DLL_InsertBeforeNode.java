package day27_Doubly_Linked_List;

// Insert a new node before a specific node (not by index)

class DoublyNode7 {
    int data;
    DoublyNode7 prev;
    DoublyNode7 next;

    DoublyNode7(int data) {
        this.data = data;
    }
}


public class DLL_InsertBeforeNode {

    DoublyNode7 head;

    // Insert at end for initial values
    public void insertAtEnd(int data) {
        DoublyNode7 newNode = new DoublyNode7(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode7 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert before a given node (by value)
    public void insertBeforeNode(int targetData, int newData) {
        DoublyNode7 temp = head;

        // Traverse to find the target node
        while (temp != null && temp.data != targetData) {
            temp = temp.next;

        }

        if (temp == null) {
            System.out.println("Target node not found: " + targetData);
            return;
        }

        DoublyNode7 newNode = new DoublyNode7(newData);
        newNode.next = temp;
        newNode.prev = temp.prev;

        if (temp.prev != null) {
            temp.prev.next = newNode;
        } else {
            // If inserted before head
            head = newNode;
        }

        temp.prev = newNode;
    }

    // Print DLL
    public void printForward() {
        DoublyNode7 temp = head;
        System.out.print("DLL : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_InsertBeforeNode list = new DLL_InsertBeforeNode();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.printForward();  // 10 20 30 40

        list.insertBeforeNode(10, 5);
        list.insertBeforeNode(20, 15);
        list.insertBeforeNode(30, 25);
        list.insertBeforeNode(40, 35);

        list.insertBeforeNode(99, 100);   // invalid

        list.printForward();    //  5, 10, 15, 20, 25, 30, 35, 40
    }

}
