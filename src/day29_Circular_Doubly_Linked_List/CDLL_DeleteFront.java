package day29_Circular_Doubly_Linked_List;

// Delete from Front in Circular Doubly Linked List

class CDLLNode3 {
    int data;
    CDLLNode3 prev;
    CDLLNode3 next;

    CDLLNode3(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class CDLL_DeleteFront {
    CDLLNode3 head = null;

    // Insert at front
    public void insertFront(int data) {
        CDLLNode3 newNode = new CDLLNode3(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        CDLLNode3 tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        tail.next = newNode;
        head.prev = newNode;

        head = newNode;
    }

    // Delete from front
    public void deleteFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Only one node
        if (head.next == head) {
            head = null;
            return;
        }

        CDLLNode3 tail = head.prev;
        head = head.next;

        tail.next = head;
        head.prev = tail;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty");
            return;
        }

        CDLLNode3 temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_DeleteFront list = new CDLL_DeleteFront();
        list.insertFront(30);
        list.insertFront(20);
        list.insertFront(10);
        list.display();  // 10 20 30

        list.deleteFront();  // Delete 10
        list.display();      // 20 30

        list.deleteFront();  // Delete 20
        list.display();      // 30

        list.deleteFront();  // Delete 30
        list.display();      // CDLL List is empty

        list.deleteFront();  // List is empty
    }

}

/*

Logic
-If list is empty → print a message.
-If one node → set head = null.
-Else → update head to head.next, and update links of tail and new head.

 */