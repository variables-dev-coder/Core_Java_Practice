package day27_Doubly_Linked_List;


// Check if Doubly Linked List (DLL) is Empty
// Check whether the DLL has no nodes (i.e., is empty).

class DoublyNode14 {
    int data;
    DoublyNode14 prev;
    DoublyNode14 next;

    DoublyNode14(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class DLL_CheckEmpty {

    DoublyNode14 head;

    // check if DLL is empty
    public boolean isEmpty() {
        return head == null;
    }

    // add a node at end
    public void insertAtEnd(int data) {
        DoublyNode14 newNode = new DoublyNode14(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode14 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // print list
    public void printList() {
        DoublyNode14 temp = head;
        System.out.print("DLL : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_CheckEmpty list = new DLL_CheckEmpty();

        System.out.println("Is DLL empty ? " + list.isEmpty());  // true

        //list.insertAtEnd(100);
        //list.insertAtEnd(200);

        list.printList();

        System.out.println("Is DLL Empty? " + list.isEmpty());
    }
}
