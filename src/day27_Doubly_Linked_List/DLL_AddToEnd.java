package day27_Doubly_Linked_List;


class DoublyNode4 {
    int data;
    DoublyNode4 prev;
    DoublyNode4 next;

    DoublyNode4 (int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class DLL_AddToEnd {
    DoublyNode4 head;

    // Add node at the end
    public void addEnd(int data) {
        DoublyNode4 newNode = new DoublyNode4(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode4 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print list forward
    public void printForward() {
        DoublyNode4 temp = head;
        System.out.print("Add to End DLL Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL_AddToEnd end = new DLL_AddToEnd();

        end.addEnd(10);
        end.addEnd(20);
        end.addEnd(30);
        end.addEnd(40);
        end.addEnd(50);

        end.printForward();
    }
}
