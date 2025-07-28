package day29_Circular_Doubly_Linked_List;


// CDLL Reverse Display

class CDLLNode9 {
    int data;
    CDLLNode9 prev;
    CDLLNode9 next;

    CDLLNode9(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class CDLL_ReverseDisplay {

    CDLLNode9 head = null;

    // Insert at end (for test)
    public void insertEnd(int data) {
        CDLLNode9 newNode = new CDLLNode9(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        CDLLNode9 tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Reverse display
    public void reverseDisplay() {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode9 tail = head.prev;
        CDLLNode9 temp = tail;

        System.out.print("Reverse CDLL: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }

    // Forward display
    public void display() {
        if (head == null) {
            System.out.println("CDLL is empty.");
            return;
        }

        CDLLNode9 temp = head;
        System.out.print("Forward CDLL: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CDLL_ReverseDisplay list = new CDLL_ReverseDisplay();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);

        list.display();         // Forward: 10 20 30 40
        list.reverseDisplay();  // Reverse: 40 30 20 10
    }
}

/*

Logic
head.prev gives us the last node (tail).
We use prev links to move backward.
We loop until we reach the original tail again (do-while).

 */