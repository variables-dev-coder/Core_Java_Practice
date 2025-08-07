package day19_Merge_Sort;

// You are given the heads of two sorted linked lists.
// Merge them into one sorted list and return the head of the new list.

class ListNode {
    int val;
    ListNode3 next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeSortedLinkedLists {

    public static void main(String[] args) {
        // Creating first sorted list: 1 -> 3 -> 5
        ListNode3 l1 = new ListNode3(1);
        l1.next = new ListNode3(3);
        l1.next.next = new ListNode3(5);

        // Creating second sorted list: 2 -> 4 -> 6
        ListNode3 l2 = new ListNode3(2);
        l2.next = new ListNode3(4);
        l2.next.next = new ListNode3(6);

        ListNode3 mergedHead = mergeTwoLists(l1, l2);
        printList(mergedHead);
    }

    // Function to merge two sorted linked lists
    public static ListNode3 mergeTwoLists(ListNode3 l1, ListNode3 l2) {
        // Dummy node to form the base of merged list
        ListNode3 dummy = new ListNode3(-1);
        ListNode3 tail = dummy;

        // Traverse both lists and pick smaller node
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Add remaining elements
        if (l1 != null) {
            tail.next = l1;
        } else if (l2 != null) {
            tail.next = l2;
        }

        return dummy.next;
    }

    // Function to print linked list
    public static void printList(ListNode3 head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null