package day26_Singly_LinkedList;

public class DetectCycleInLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Singly Linked List class
    static class  SinglyLinkedList {
        Node head;

        // Add node at end

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        // method to create a cycle ( for testing )
        public void createCycle(int position) {
            if (position <= 0) return;

            Node cycleNode = null;
            Node current = head;
            int index = 1;

            while (current.next != null) {
                if (index == position) {
                    cycleNode = current;
                }
                current = current.next;
                index++;
            }

            current.next = cycleNode;    // create cycle
        }

        // Detect cycle using Floyd's Algorithm
        public boolean hasCycle() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.createCycle(3);   // create cycle starting at node with value 3

        boolean result = list.hasCycle();
        System.out.println("Cycle Detected: " + result);

    }
}
