package day29_Circular_Doubly_Linked_List;


// CDLL Reverse List

class CDLLNode10 {
    int data;
    CDLLNode10 next;
    CDLLNode10 prev;

    CDLLNode10(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CDLL_ReverseList {

    CDLLNode10 head = null;

    // Insert at end
    public void insertEnd(int data) {
        CDLLNode10 newNode = new CDLLNode10(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        CDLLNode10 tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Reverse the list by changing links
    public void reverseCDLL() {
        if (head == null || head.next == head) {
            return; // empty or single node
        }

        CDLLNode10 current = head;
        CDLLNode10 temp = null;

        do {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // move to next node (which is prev now)
        } while (current != head);

        // update head
        head = head.next;
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode10 temp = head;
        System.out.print("CDLL: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_ReverseList list = new CDLL_ReverseList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        System.out.println("Before Reversing:");
        list.display();

        list.reverseCDLL();

        System.out.println("After Reversing:");
        list.display();
    }
}

/*
Logic Behind reverseCDLL():
For each node, swap prev and next.
After loop, update head = head.next;
because it’s reversed now.
 */