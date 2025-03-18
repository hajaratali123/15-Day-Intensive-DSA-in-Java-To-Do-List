package llinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Manually creating nodes
        DoublyLinkedList.Node n1 = new DoublyLinkedList.Node(10);
        DoublyLinkedList.Node n2 = new DoublyLinkedList.Node(20);
        DoublyLinkedList.Node n3 = new DoublyLinkedList.Node(30);
        dll.head = n1;
        n1.next=n2; n2.prev=n1;

        n2.next = n3;n3.prev = n2;
        dll.tail = n3;
        dll.size = 3;

        System.out.println("DLL after manual insertion:");
        dll.displayForward();
        dll.displayBackward();


        System.out.println("==== Doubly Linked List (DLL) ====");
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtHead(5);
        dll.insertAtIndex(2, 15);
        dll.displayForward();
        dll.displayBackward();

        dll.deleteAtHead();
        dll.deleteAtEnd();
        dll.deleteAtIndex(1);
        dll.displayForward();


    }
}

