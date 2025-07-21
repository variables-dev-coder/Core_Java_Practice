package day27_Doubly_Linked_List;



class DoublyNode3 {
    int data;
    DoublyNode3 prev;
    DoublyNode3 next;

    DoublyNode3 (int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class DLL_AddToFront {
    DoublyNode3 head;

    // Add Node at the front
    public void addFront(int data) {
        DoublyNode3 newNode = new DoublyNode3(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Print List Forward
    public void printForward() {
        DoublyNode3 temp = head;
        System.out.print("Dll Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_AddToFront front = new DLL_AddToFront();

        front.addFront(10);
        front.addFront(20);
        front.addFront(30);
        front.addFront(40);
        front.addFront(50);

        front.printForward();
    }
}
