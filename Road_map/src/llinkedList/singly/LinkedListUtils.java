package llinkedList.singly;

public class LinkedListUtils {
    // ✅ Print Linked List
    public static void print(Node head) {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ✅ Find Middle Element (Slow-Fast Pointer)
    public static void findMiddle(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element: " + slow.data);
    }

    // ✅ Get Size of Linked List
    public static void getSize(LinkedList list) {
        System.out.println("Size of linked list: " + list.size);
    }
}
