package Stacks;

// Stack implementation using a Linked List
class StackLinkedList {
    private class Node {
        int data;
        Node next;
    }

    private Node top;

    // Constructor
    public StackLinkedList() {
        this.top = null;
    }

    // Push operation
    public void push(int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
    }
}

