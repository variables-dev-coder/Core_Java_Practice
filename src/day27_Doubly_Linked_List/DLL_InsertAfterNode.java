package day27_Doubly_Linked_List;

// Goal: Insert a new node after a specific node (not by index)

class DoublyNode6 {
    int data;
    DoublyNode6 prev;
    DoublyNode6 next;

    DoublyNode6 (int data) {
        this.data = data;
    }
}

public class DLL_InsertAfterNode {
    DoublyNode6 head;

    // Insert at the end for testing
    public void insertAtEnd(int data) {
        DoublyNode6 newNode = new DoublyNode6(data);
        if (head == null) {

            head = newNode;
            return;
        }
        DoublyNode6 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert after a given node (by value)
    public void insertAfterNode(int targetData, int newData) {
        DoublyNode6 temp = head;

        // Find target Node
        while (temp != null && temp.data != targetData) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Target node not found: " + targetData);
            return;
        }

        DoublyNode6 newNode = new DoublyNode6(newData);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // Print Dll
    public void printForward() {
        DoublyNode6 temp = head;
        System.out.println("DLL : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_InsertAfterNode list = new DLL_InsertAfterNode();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.printForward();   // 10 20 30 40

        list.insertAfterNode(10, 15);
        list.insertAfterNode(20, 25);
        list.insertAfterNode(30, 35);
        list.insertAfterNode(40, 45);

        list.insertAfterNode(99, 100);    // Invalid case

        list.printForward();  // 10, 15, 20, 25, 30, 35, 40, 45
    }
}
