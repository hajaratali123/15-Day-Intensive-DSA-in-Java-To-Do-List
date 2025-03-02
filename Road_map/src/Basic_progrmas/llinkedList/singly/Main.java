package Basic_progrmas.llinkedList.singly;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // 🔹 Insert Elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        LinkedListUtils.print(list.head);

        // 🔹 Insert at Head
        list.insertAtHead(5);
        LinkedListUtils.print(list.head);

        // 🔹 Insert at Given Index
        list.insertAtIndex(2, 25);
        LinkedListUtils.print(list.head);

        // 🔹 Delete at Given Index
        list.deleteAtIndex(3);
        LinkedListUtils.print(list.head);

        // 🔹 Get Element at Index
        System.out.println("Element at index 2: " + list.getElementAtIndex(2));

        // 🔹 Set Element at Index
        list.setElementAtIndex(2, 99);
        LinkedListUtils.print(list.head);

        // 🔹 Find Middle Element
        LinkedListUtils.findMiddle(list.head);

        // 🔹 Get Size
        LinkedListUtils.getSize(list);
    }
}
