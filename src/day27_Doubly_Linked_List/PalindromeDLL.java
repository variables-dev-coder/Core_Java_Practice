package day27_Doubly_Linked_List;



class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class PalindromeDLL {

    Node head;

    // Add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // ✅ Check if DLL is a Palindrome
    public boolean isPalindromeDLL() {
        if (head == null || head.next == null) return true;

        // Find the last node
        Node left = head;
        Node right = head;
        while (right.next != null)
            right = right.next;

        // Compare from both ends
        while (left != right && left.prev != right) {
            if (left.data != right.data)
                return false;
            left = left.next;
            right = right.prev;
        }

        return true;
    }

    // Print DLL
    public void printList() {
        Node temp = head;
        System.out.print("DLL: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        PalindromeDLL dll = new PalindromeDLL();

        // Try with: Palindrome: 1 2 3 2 1
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(2);
        dll.addLast(1);

        dll.printList();

        System.out.println("Is Palindrome? " + dll.isPalindromeDLL());
    }
}
