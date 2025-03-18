package llinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {



        System.out.println("\n==== Circular Linked List (CLL) ====");
        CircularLinkedList cll = new CircularLinkedList();

        CircularLinkedList.Node c1 = new CircularLinkedList.Node(10);
        CircularLinkedList.Node c2 = new CircularLinkedList.Node(20);
        CircularLinkedList.Node c3 = new CircularLinkedList.Node(30);

        // Manually linking nodes in circular manner
        cll.head = c1;
        c1.next = c2;
        c2.next = c3;
        c3.next = c1; // Making it circular
        cll.tail = c3;
        cll.size = 3;

        System.out.println("CLL after manual insertion:");
        cll.display();
        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtHead(5);
        cll.display();

        cll.deleteAtHead();
        cll.display();

        cll.deleteAtEnd();
        cll.display();
    }
}
