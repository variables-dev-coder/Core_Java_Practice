package day19_Merge_Sort;

/*

Recursive Merge of Two Sorted Linked Lists
Logic:
-Base case: if one list is empty, return the other.
-Compare head nodes of both lists.
-The smaller node becomes the new head.
-Recursively merge the rest of the lists.

 */

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
    }
}

public class RecursiveMergeLinkedList {
    public static void main(String[] args) {
        // List 1: 1 -> 3 -> 5
        ListNode1 l1 = new ListNode1(1);
        l1.next = new ListNode1(3);
        l1.next.next = new ListNode1(5);

        // List 2: 2 -> 4 -> 6
        ListNode1 l2 = new ListNode1(2);
        l2.next = new ListNode1(4);
        l2.next.next = new ListNode1(6);

        ListNode1 merged = mergeRecursive(l1, l2);
        printList(merged);
    }

    public static ListNode1 mergeRecursive(ListNode1 l1, ListNode1 l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeRecursive(l1, l2.next);
            return l2;
        }
    }

    public static void printList(ListNode1 head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null