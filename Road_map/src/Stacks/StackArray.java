package Stacks;

public class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray() {
        arr = new int[10];
        top = -1;
        capacity = 10;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = x; // Fixing the issue
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--]; // Fixing the issue
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
    public int size(){
        return top+1;
    }

    public static void main(String[] args) { // Fixing the method signature
        StackArray stack = new StackArray();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }
}
