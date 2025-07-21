package day27_Doubly_Linked_List;

public class MainDLL {
    public static void main(String[] args) {
        DoublyLinkedList_2 list = new DoublyLinkedList_2();

        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(30);
        list.addToEnd(40);

        System.out.println("Print Forward: ");
        list.printForward();

        System.out.println("print Backward: ");
        list.printBackward();
    }

}
