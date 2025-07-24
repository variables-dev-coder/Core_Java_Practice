package day27_Doubly_Linked_List;



class Node22 {
    int data;
    Node22 prev, next;

    Node22(int data) {
        this.data = data;
    }
}
public class PairSumDLL {
    // Find pair with sum X
    public static void findPairSum(Node22 head, int target) {
        Node22 start = head;
        Node22 end = head;

        // Move end to the last node
        while (end.next != null) {
            end = end.next;
        }

        boolean found = false;
        while (start != null && end != null && start != end && end.next != start) {
            int sum = start.data + end.data;
            if (sum == target) {
                System.out.println("(" + start.data + ", " + end.data + ")");
                found = true;
                start = start.next;
                end = end.prev;
            } else if (sum < target) {
                start = start.next;
            } else {
                end = end.prev;
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }

    // Create DLL from array
    public static Node22 createDLLFromArray(int[] arr) {
        Node22 head = null, tail = null;
        for (int data : arr) {
            Node22 newNode = new Node22(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        return head;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 8, 9};
        int target = 7;

        Node22 head = createDLLFromArray(arr);

        System.out.println("Pairs with sum " + target + ":");
        findPairSum(head, target);
    }
}
