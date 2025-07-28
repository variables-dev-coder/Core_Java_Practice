package day29_Circular_Doubly_Linked_List;


class CDLLNode4 {
    int data;
    CDLLNode4 prev;
    CDLLNode4 next;

    CDLLNode4(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class CDLL_DeleteEnd {

    CDLLNode4 head = null;

    // Insert at front
    public void insertFront(int data) {
        CDLLNode4 newNode = new CDLLNode4(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        CDLLNode4 tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;

        head = newNode;
    }

    // Delete from end
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return;
        }

        CDLLNode4 tail = head.prev;
        CDLLNode4 newTail = tail.prev;

        newTail.next = head;
        head.prev = newTail;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty");
            return;
        }

        CDLLNode4 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_DeleteEnd list = new CDLL_DeleteEnd();
        list.insertFront(30);
        list.insertFront(20);
        list.insertFront(10);
        list.display();  // 10 20 30

        list.deleteEnd();  // Delete 30
        list.display();    // 10 20

        list.deleteEnd();  // Delete 20
        list.display();    // 10

        list.deleteEnd();  // Delete 10
        list.display();    // CDLL is empty

        list.deleteEnd();  // List is empty
    }

}


/*

 Logic
-If list is empty → print message.
-If only 1 node → set head = null.
-Else → update tail = tail.prev and fix links with head.

 */