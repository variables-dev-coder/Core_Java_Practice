package day27_Doubly_Linked_List;

// Find Length of Doubly Linked List
// Count and return how many nodes are present in the Doubly Linked List (DLL).

class DoublyNode13 {
    int data;
    DoublyNode13 prev;
    DoublyNode13 next;

    DoublyNode13(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class DLL_Length {

    DoublyNode13 head;

    // Insert at end
    public void insertAtEnd(int data) {
        DoublyNode13 newNode = new DoublyNode13(data) ;
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode13 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Find length of DLL
    public int findLength() {
        int count = 0;
        DoublyNode13 temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Print list
    public void printList() {
        DoublyNode13 temp = head;
        System.out.print("DLL : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_Length list = new DLL_Length();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.printList();

        int len = list.findLength();
        System.out.println("Length of DLL : " + len);
    }
}
