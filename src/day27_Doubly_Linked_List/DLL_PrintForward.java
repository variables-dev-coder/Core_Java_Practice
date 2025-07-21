package day27_Doubly_Linked_List;

// DLL print Forward

class DoublyNode1 {
    int data;
    DoublyNode1 prev;
    DoublyNode1 next;

    DoublyNode1(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL_PrintForward {
    DoublyNode1 head;

    public void addLast(int data) {
        DoublyNode1 newNode = new DoublyNode1(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode1 temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // print DLL from head to end
    public void printForward(){
        System.out.println("DLL Forward: ");
        DoublyNode1 temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {
       DLL_PrintForward list = new DLL_PrintForward();

       list.addLast(10);
       list.addLast(20);
       list.addLast(30);
       list.addLast(40);
       list.addLast(50);

       list.printForward();     // Output: DLL Forward: 10 20 30 40 50
    }
}
