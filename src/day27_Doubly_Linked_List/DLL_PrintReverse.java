package day27_Doubly_Linked_List;




class DoublyNode2 {
    int data;
    DoublyNode2 prev;
    DoublyNode2 next;

    DoublyNode2 (int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_PrintReverse {
    DoublyNode2 head;

    // add node at the end
    public void addLast(int data) {
        DoublyNode2 newNode = new DoublyNode2(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // print list in reverse
    public void printReverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Go to last node
        DoublyNode2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        //Print in reverse
        System.out.println("DLL Reverse:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        DLL_PrintReverse list = new DLL_PrintReverse();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);


        list.printReverse();
    }
}
