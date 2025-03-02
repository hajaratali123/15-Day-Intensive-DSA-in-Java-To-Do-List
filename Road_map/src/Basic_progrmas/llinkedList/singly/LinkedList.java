package Basic_progrmas.llinkedList.singly;

public class LinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    // ✅ Insert at End
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // ✅ Insert at Head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // ✅ Insert at Given Index
    public void insertAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            insertAtHead(data);
        } else if (index == size) {
            insert(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    // ✅ Delete at Head
    public void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    // ✅ Delete at Given Index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        if (index == 0) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
        size--;
    }

    // ✅ Get Element by Index
    public int getElementAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // ✅ Set Element by Index
    public void setElementAtIndex(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data = value;
    }
}
